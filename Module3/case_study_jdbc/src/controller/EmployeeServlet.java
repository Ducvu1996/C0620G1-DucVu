package controller;

import BO.EmployeeBO;
import BO.EmployeeBOIplm;
import model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeBO employeeBO;
    public void init() {
        employeeBO = new EmployeeBOIplm();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertEmployee(request, response);
                    break;
                case "edit":
                    updateEmployee(request, response);
                    break;
                case "delete":
                    deleteEmployee(request, response);
                    break;
            }
        } catch (SQLException ex) {
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
                case "edit":
                    showUpdateForm(request, response);
                    break;

                case "search":
                    searchEmployee(request,response);
                    break;
                default:
                    listEmployee(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employee_name = request.getParameter("employee_name");
        List<Employee> listEmployee =  employeeBO.findByName(employee_name);
        request.setAttribute("listEmployee", listEmployee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list.jsp");
        dispatcher.forward(request, response);

    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, SQLException, IOException {
        int employee_id = Integer.parseInt(request.getParameter("employee_id"));
        employeeBO.remove(employee_id);
        listEmployee(request,response);
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
        int employee_id= Integer.parseInt(request.getParameter("employee_id"));
        String employee_name= request.getParameter("employee_name");
        String employee_birthday= request.getParameter("employee_birthday");
        String employee_email= request.getParameter("employee_email");
        String employee_address= request.getParameter("employee_address");
        Employee employee = new Employee(employee_name,employee_birthday,employee_email,employee_address);
        employeeBO.update(employee_id,employee);
        listEmployee(request,response);

    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException{
        int employee_id = Integer.parseInt(request.getParameter("employee_id"));
        Employee employee = employeeBO.findById(employee_id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/edit.jsp");
        request.setAttribute("employee", employee);
        dispatcher.forward(request, response);
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException, ServletException {
            List<Employee> listEmployee = employeeBO.findAll();
            request.setAttribute("listEmployee", listEmployee);
            RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list.jsp");
            dispatcher.forward(request, response);
    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String employee_name= request.getParameter("employee_name");
        String employee_birthday= request.getParameter("employee_birthday");
        String employee_id_card= request.getParameter("employee_id_card");
        Double employee_salary= Double.parseDouble(request.getParameter("employee_salary"));
        String employee_phone= request.getParameter("employee_phone");
        String employee_email= request.getParameter("employee_email");
        String employee_address= request.getParameter("employee_address");
        Integer position_id= Integer.parseInt(request.getParameter("position_id"));
        Integer education_degree_id= Integer.parseInt(request.getParameter("education_degree_id"));
        Integer division_id= Integer.parseInt(request.getParameter("division_id"));
        String user_name= request.getParameter("user_name");
        String password= request.getParameter("password");

        Employee employee = new Employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,
                position_id,education_degree_id,division_id,user_name);
        employeeBO.save(employee,password);

        listEmployee(request,response);

    }
}
