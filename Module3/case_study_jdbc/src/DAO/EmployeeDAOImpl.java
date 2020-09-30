package DAO;

import model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private BaseDAO  baseDAO= new BaseDAO();
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("SELECT employee_id, employee_name," +
                    "employee_birthday,employee_email,employee_address,\n" +
                    "employee.user_name\n" +
                    " FROM employee \n" +
                    " left join position on employee.position_id= position.position_id\n" +
                    " left join education_degree on employee.education_degree_id =education_degree.education_degree_id\n" +
                    " left join division on employee.division_id= division.division_id\n" +
                    " left join user on user.user_name= employee.user_name\n" +
                    " ;");
            ResultSet resultSet=preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()){
                Integer employee_id =Integer.valueOf(resultSet.getString("employee_id"));
                String employee_name= resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                String user_name = resultSet.getString("user_name");
                employee= new Employee(employee_id,employee_name,employee_birthday,employee_email,employee_address,user_name);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public String save(Employee employee) {
        try {
        PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("insert into employee " +
                "(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,\n" +
                " employee_email,employee_address,position_id,education_degree_id,division_id,user_name)\n" +
                "values\n" +
                "\t(?, ?,?,?,?,?, ?,?,?,?,?);" );
        preparedStatement.setString(1,employee.getEmployee_name());
        preparedStatement.setString(2,employee.getEmployee_birthday());
        preparedStatement.setString(3,employee.getEmployee_id_card());
        preparedStatement.setDouble(4,employee.getEmployee_salary());
        preparedStatement.setString(5,employee.getEmployee_phone());
        preparedStatement.setString(6,employee.getEmployee_email());
        preparedStatement.setString(7,employee.getEmployee_address());
        preparedStatement.setInt(8,employee.getPosition_id());
        preparedStatement.setInt(9,employee.getEducation_degree_id());
        preparedStatement.setInt(10,employee.getDivision_id());
        preparedStatement.setString(11,employee.getUser_name());
        preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Employee employee) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Employee> findByName(String employee_name) {
        return null;
    }
}
