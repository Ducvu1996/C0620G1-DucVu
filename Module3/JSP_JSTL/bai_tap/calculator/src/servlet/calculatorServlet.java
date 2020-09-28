package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet",urlPatterns = "/calculatorServlet")
public class calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstOperand = request.getParameter("firstOperand");
        String secondOperand = request.getParameter("secondOperand");
        String operator = request.getParameter("operator");
        String result = String.valueOf(calculator(firstOperand,operator,secondOperand));

        request.setAttribute("result",result);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }
    protected  int calculator (String firstOperand, String operator, String secondOperand){
        if(operator.equals("+")){
            return Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand);
        }
        if(operator.equals("-")){
            return Integer.parseInt(firstOperand) - Integer.parseInt(secondOperand);
        }
        if(operator.equals("*")){
            return Integer.parseInt(firstOperand) * Integer.parseInt(secondOperand);
        }
        if(operator.equals("/")){
            return Integer.parseInt(firstOperand) / Integer.parseInt(secondOperand);
        }
        return 0;
    }
}
