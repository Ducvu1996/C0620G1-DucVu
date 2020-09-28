package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCalculatorDiscount",urlPatterns = "/Calculation")
public class ServletCalculatorDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameProduct= request.getParameter("nameProduct");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountPrice = listPrice -listPrice*discountPercent/100;
        double discountAmount= listPrice*discountPercent/100;
        request.setAttribute("nameProduct",nameProduct);
        request.setAttribute("discountPrice",String.valueOf(discountPrice));
        request.setAttribute("discountAmount",String.valueOf(discountAmount));
        request.getRequestDispatcher("show.jsp").forward(request,response);

    }
}
