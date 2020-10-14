package BO;

import DAO.EmployeeDAO;
import DAO.EmployeeDAOImpl;
import model.Division;
import model.EducationDegree;
import model.Employee;
import model.Position;

import java.util.List;

public class EmployeeBOIplm implements EmployeeBO {
    EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    public String save(Employee employee, String password) {
        return this.employeeDAO.save(employee,password);
    }

    @Override
    public Employee findById(int id) {
        return this.employeeDAO.findById(id);
    }

    @Override
    public void update(int id, Employee employee) {
        this.employeeDAO.update(id, employee);
    }

    @Override
    public void remove(int id) {
        this.employeeDAO.remove(id);
    }

    @Override
    public List<Employee> findByName(String employee_name) {
        return this.employeeDAO.findByName(employee_name);
    }

    @Override
    public List<Division> allDivision() {
        return this.employeeDAO.allDivision();
    }

    @Override
    public List<Position> allPosition() {
        return this.employeeDAO.allPosition();
    }

    @Override
    public List<EducationDegree> allEducationDegree() {
        return this.employeeDAO.allEducationDegree();
    }
}
