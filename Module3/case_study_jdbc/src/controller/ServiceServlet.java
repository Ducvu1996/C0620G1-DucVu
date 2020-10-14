package controller;

import BO.ServiceBO;
import BO.ServiceBOIplm;
import model.RentType;
import model.Service;
import model.ServiceType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet",urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    private ServiceBO serviceBO;
    public void init(){ serviceBO = new ServiceBOIplm();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertService(request, response);
                    break;

            }
            listService(request, response);

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
                    listService(request, response);
                    break;
            }
        } catch (SQLException ex ) {
            ex.printStackTrace();
        }
    }
    private void listService(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException, SQLException {
        List<Service> serviceList = serviceBO.findAll();
        List<ServiceType> serviceTypeList = serviceBO.allServiceType();
        List<RentType> rentTypeList = serviceBO.allRentType();
        request.setAttribute("serviceList", serviceList);
        request.setAttribute("serviceTypeList", serviceTypeList);
        request.setAttribute("rentTypeList", rentTypeList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("service/list.jsp");
        dispatcher.forward(request, response);

    }

    private void insertService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ,SQLException {
        Service service;
         String service_name =request.getParameter("service_name");
         Integer service_area=Integer.valueOf( request.getParameter("service_area"));
         Double service_cost=Double.parseDouble(request.getParameter("service_cost"));
         Integer service_max_people=Integer.valueOf(request.getParameter("service_max_people"));
         String standard_room=request.getParameter("standard_room");
         String description_other_convenience=request.getParameter("description_other_convenience");
         Double pool_area=Double.parseDouble(request.getParameter("pool_area"));
         Integer number_of_floors=Integer.valueOf(request.getParameter("number_of_floors"));
         int rent_type_id=Integer.parseInt(request.getParameter("rent_type_id"));
         int service_type_id=Integer.parseInt(request.getParameter("service_type_id"));
         service = new Service(service_name,service_area,service_cost,service_max_people,standard_room,description_other_convenience,pool_area,
                 number_of_floors,rent_type_id,service_type_id);
         serviceBO.save(service);
    }

}
