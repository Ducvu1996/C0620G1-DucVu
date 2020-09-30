package BO;

import DAO.EmployeeDAO;
import DAO.EmployeeDAOImpl;
import model.Employee;

import java.util.List;

public class EmployeeBOIplm implements EmployeeBO {
    EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    public String save(Employee employee) {
        return this.employeeDAO.save(employee);
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
        return null;
    }
}
