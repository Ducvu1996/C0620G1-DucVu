package DAO;

import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;

import java.sql.Connection;
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
    public String save(Employee employee,String password) {
        Connection connection =this.baseDAO.getConnection();
        try {
            PreparedStatement preparedStatementUser = connection.prepareStatement("" +
                    "insert into user (user_name,password) values (?,?)");
            preparedStatementUser.setString(1,employee.getUser_name());
            preparedStatementUser.setString(2,password);
            connection.setAutoCommit(false);
            int rowAffected= preparedStatementUser.executeUpdate();

            if (rowAffected == 1) {
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
                connection.commit();
                return "ok";

            }else {
                    connection.rollback();
            }

            }catch (SQLException e) {
                e.printStackTrace();
            }
            return "ok";
    }

    @Override
    public Employee findById(int id) {
        Employee employee=null;
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select * from employee where employee_id =?");

            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String employee_name= resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                employee = new Employee(id,employee_name,employee_birthday,employee_email,employee_address);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void update(int id, Employee employee) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("update employee " +
                    "set employee_name = ?,employee_birthday = ?,employee_email = ?,employee_address = ? where employee_id =?");
            preparedStatement.setString(1,employee.getEmployee_name());
            preparedStatement.setString(2,employee.getEmployee_birthday());
            preparedStatement.setString(3,employee.getEmployee_email());
            preparedStatement.setString(4,employee.getEmployee_address());
            preparedStatement.setInt(5,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        Connection connection =this.baseDAO.getConnection();
        try {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from employee where employee_id = ?;");
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> findByName(String employee_name_search) {
        List<Employee> employeeList = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select * from employee where employee_name like ?");
            preparedStatement.setString(1,"%"+employee_name_search+"%");

            ResultSet resultSet =preparedStatement.executeQuery();
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
    public List<Division> allDivision() {
        List<Division> divisionList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select * from division");
            ResultSet rs =preparedStatement.executeQuery();
            Division division;
            while (rs.next()){
                int division_id =Integer.valueOf(rs.getString("division_id"));
                String division_name= rs.getString("division_name");
                division =new Division(division_id , division_name);
                divisionList.add(division);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divisionList;
    }

    @Override
    public List<Position> allPosition() {
        List<Position> positionList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select * from position ");
            ResultSet resultSet = preparedStatement.executeQuery();
            Position position;
            while (resultSet.next()){
                int position_id =Integer.valueOf(resultSet.getString("position_id"));
                String position_name= resultSet.getString("position_name");
                position = new Position(position_id,position_name);
                positionList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positionList;
    }

    @Override
    public List<EducationDegree> allEducationDegree() {
        List<EducationDegree>  educationDegreeList= new ArrayList<>();
        try {
            PreparedStatement preparedStatement =this.baseDAO.getConnection().prepareStatement("select * from education_degree ");
            ResultSet resultSet = preparedStatement.executeQuery();
            EducationDegree educationDegree;
            while (resultSet.next()){
                int education_degree_id =Integer.valueOf(resultSet.getString("education_degree_id"));
                String education_degree_name= resultSet.getString("education_degree_name");
                educationDegree = new EducationDegree(education_degree_id,education_degree_name);
                educationDegreeList.add(educationDegree);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegreeList;
    }
}
