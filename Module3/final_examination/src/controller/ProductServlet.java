package controller;

import BO.ProductBO;
import BO.ProductBOImpl;
import model.Category;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet" , urlPatterns = {"","/product"})
public class ProductServlet extends HttpServlet {
    ProductBO productBO = new ProductBOImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertProduct(request, response);
                    break;
                case "edit":
                    updateProduct(request, response);
                    break;
                case "delete":
                    deleteProduct(request, response);
                    break;

            }
              listProduct(request, response);

        } catch (SQLException ex ) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "search":
                    searchProduct(request,response);
                    break;
                default:
                    listProduct(request, response);
                    break;
            }
        } catch (SQLException ex ) {
            ex.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        Product product;
        int product_id =Integer.parseInt(request.getParameter("product_id"));
        String product_name =request.getParameter("product_name");
        String product_price =request.getParameter("product_price");
        int product_quantity =Integer.parseInt(request.getParameter("product_quantity"));
        String product_color =request.getParameter("product_color");
        int product_category_id = Integer.parseInt(request.getParameter("product_category_id"));
        product = new Product(product_name,product_price,product_quantity,product_color,product_category_id);
        productBO.update(product_id,product);
    }



    private void listProduct(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException,SQLException{
        List<Product> productList =productBO.findAll();
        List<Category> categoryList =productBO.allCategory();

        request.setAttribute("productList",productList);
        request.setAttribute("categoryList",categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/product.jsp");
        dispatcher.forward(request, response);
    }
    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product_name = request.getParameter("product_name");
        List<Category> categoryList =productBO.allCategory();
        List<Product> productList =  productBO.findByName(product_name);
        request.setAttribute("productList", productList);
        request.setAttribute("categoryList",categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/product.jsp");
        dispatcher.forward(request, response);
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) {
        Product product ;
        String product_name =request.getParameter("product_name");
        String product_price =request.getParameter("product_price");
        int product_quantity =Integer.parseInt(request.getParameter("product_quantity"));
        String product_color =request.getParameter("product_color");
        String product_description =request.getParameter("product_description");
        int product_category_id = Integer.parseInt(request.getParameter("product_category_id"));
        product = new Product(product_name,product_price,product_quantity,product_color,product_description,product_category_id);
        productBO.save(product);
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int product_id =Integer.parseInt(request.getParameter("product_id"));
        productBO.remove(product_id);
    }

}
