package DAO;

import model.Customer;
import model.RentType;
import model.Service;
import model.ServiceType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAOIplm implements ServiceDAO {
    private BaseDAO baseDAO = new  BaseDAO();
    @Override
    public List<Service> findAll() {
        List<Service> serviceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "select service_id,service_name,service_cost,number_of_floors,rent_type_name,service_type_name" +
                    " from service " +
                    "left join rent_type on rent_type.rent_type_id = service.rent_type_id " +
                    "left join service_type on service_type.service_type_id = service.service_type_id");
            ResultSet resultSet = preparedStatement.executeQuery();
            Service service;
            while (resultSet.next()){
                Integer service_id = Integer.valueOf(resultSet.getString("service_id"));
                String service_name= resultSet.getString("service_name");
                String service_type_name= resultSet.getString("service_type_name");
                String rent_type_name= resultSet.getString("rent_type_name");

                Double service_cost = Double.valueOf(resultSet.getString("service_cost"));
                Integer number_of_floor = Integer.valueOf(resultSet.getString("number_of_floors"));
                service = new Service(service_id,service_name,service_cost,number_of_floor,rent_type_name,service_type_name);
                serviceList.add(service);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public String save(Service service) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("" +
                    "insert into service(service_name,service_area,service_cost,service_max_people,standard_room,description_other_convenience,pool_area,\n" +
                    "                 number_of_floors,rent_type_id,service_type_id) " +
                    "values (?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,service.getService_name());
            preparedStatement.setInt(2,service.getService_area());
            preparedStatement.setDouble(3,service.getService_cost());
            preparedStatement.setInt(4,service.getService_max_people());
            preparedStatement.setString(5,service.getStandard_room());
            preparedStatement.setString(6,service.getDescription_other_convenience());
            preparedStatement.setDouble(7,service.getPool_area());
            preparedStatement.setInt(8,service.getNumber_of_floors());
            preparedStatement.setInt(9,service.getRent_type_id());
            preparedStatement.setInt(10,service.getService_type_id());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<RentType> allRentType() {
        List<RentType> rentTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select * from rent_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            RentType rentType;
            while( resultSet.next()){
                int rent_type_id = Integer.parseInt(resultSet.getString("rent_type_id"));
                String rent_type_name = resultSet.getString("rent_type_name");
                rentType = new RentType(rent_type_id,rent_type_name);
                rentTypeList.add(rentType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypeList;
    }

    @Override
    public List<ServiceType> allServiceType() {
        List<ServiceType> serviceTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select * from service_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            ServiceType serviceType;
            while( resultSet.next()){
                int service_type_id = Integer.parseInt(resultSet.getString("service_type_id"));
                String service_type_name = resultSet.getString("service_type_name");
                serviceType = new ServiceType(service_type_id,service_type_name);
                serviceTypeList.add(serviceType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypeList;
    }
}
