package controller;

import BO.ProductBO;
import BO.ProductBOImpl;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import model.Product;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = {"","/products"})
public class ProductServlet extends HttpServlet {
    private  ProductBO productBO = new ProductBOImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action ="";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "view":
                break;
            case "search":

                break;
            default:
                formSearch(request,response);
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                formCreate(request,response);
                break;
            case "edit":
                formEdit(request,response);
                break;
            case "delete":
                formDelete(request,response);
                break;
            case "view":
                break;
            case "search":

                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    private void formSearch(HttpServletRequest request, HttpServletResponse response) {
        String nameProduct = request.getParameter("nameProduct");
        List<Product> productList = this.productBO.findByName(nameProduct);

        RequestDispatcher dispatcher;
        if(productList.isEmpty()){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("listProduct", productList);
            dispatcher = request.getRequestDispatcher("product/list.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void formDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productBO.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productBO.findById(id);
        RequestDispatcher dispatcher;
        if(request.getParameter("confirm").equals("no")){
             response.sendRedirect("/products");
        } else {
            this.productBO.remove(id);
            try {
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private void formEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productBO.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameProduct= request.getParameter("nameProduct");
        String codeProduct= request.getParameter("codeProduct");
        String price= request.getParameter("price");
        String country= request.getParameter("country");
        Product product = this.productBO.findById(id);
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            product.setNameProduct(nameProduct);
            product.setCodeProduct(codeProduct);
            product.setPrice(price);
            product.setCountry(country);
            this.productBO.update(id,product);
            request.setAttribute("product",product);
            request.setAttribute("message", "Product information was updated");
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String nameProduct = request.getParameter("nameProduct");
        String codeProduct = request.getParameter("codeProduct");
        String price = request.getParameter("price");
        String country = request.getParameter("country");
        int id = (int)(Math.random() * 10000);
        Product product = new Product(id,nameProduct,codeProduct,price,country);
        this.productBO.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message", "New customer was created");
        try {
            dispatcher.forward(request,response);

        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void formCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = this.productBO.findAll();
        request.setAttribute("listProduct",productList);
      try {
          request.getRequestDispatcher("product/list.jsp").forward(request,response);
      } catch (ServletException | IOException e) {
          e.printStackTrace();
      }
    }


}
