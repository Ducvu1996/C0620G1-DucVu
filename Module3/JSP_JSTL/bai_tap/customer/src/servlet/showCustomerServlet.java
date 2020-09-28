package servlet;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "showCustomerServlet", urlPatterns = {"","/showCustomerServlet"})
public class showCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Nguyen Duc Vu","09-09-2000","Danang","1.jpg"));
        customerList.add(new Customer(2,"Nguyen Thị Thu","09-09-2000","Danang","1.jpg"));
        customerList.add(new Customer(3,"Nguyen Thi Dung","09-09-2000","Danang","1.jpg"));
        customerList.add(new Customer(4,"Nguyen Anh Phap","09-09-2000","Danang","1.jpg"));
        customerList.add(new Customer(5,"Nguyen Gia Hoa","09-09-2000","Danang","1.jpg"));
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("customer.jsp").forward(request,response);
    }
}
