package controller;


import BO.CustomerBO;
import BO.CustomerBOImpl;
import model.Customer;
import model.CustomerType;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet" ,urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerBO customerBO;
    public void init() {
        customerBO = new CustomerBOImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertCustomer(request, response);
                    break;
                case "edit":
                    updateCustomer(request, response);
                    break;
                case "delete":
                    deleteCustomer(request, response);
                    break;
            }
            listCustomer(request, response);
            action="";
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

                default:
                    listCustomer(request, response);
                    break;
            }
        } catch (SQLException ex ) {
           ex.printStackTrace();
        }

    }


    private void listCustomer(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,SQLException {
        List<Customer> listCustomer = customerBO.findAll();
        List<CustomerType> customerTypeList = customerBO.allCustomerType();
        request.setAttribute("listCustomer", listCustomer);
        request.setAttribute("customerTypeList",customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        dispatcher.forward(request, response);
    }
    private void insertCustomer(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,SQLException {
            Customer customer;

            String customer_name = request.getParameter("customer_name");
            String customer_birthday = request.getParameter("customer_birthday");
            String customer_gender = request.getParameter("customer_gender");
            String customer_id_card = request.getParameter("customer_id_card");
            String customer_phone = request.getParameter("customer_phone");
            String customer_email = request.getParameter("customer_email");
            String customer_address = request.getParameter("customer_address");
            int customer_type_id = Integer.parseInt(request.getParameter("customer_type_id"));
            customer = new Customer(customer_name,customer_birthday,customer_gender,
                    customer_id_card,customer_phone,customer_email,customer_address,customer_type_id);
            customerBO.save(customer);

    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
        Customer customer;
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birthday");
        String customer_address = request.getParameter("customer_address");
        int customer_type_id = Integer.parseInt(request.getParameter("customer_type"));
        customer = new Customer(customer_name, customer_birthday,customer_address,customer_type_id);
        customerBO.update(customer_id,customer);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, SQLException, IOException {
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        customerBO.remove(customer_id);

    }


}
