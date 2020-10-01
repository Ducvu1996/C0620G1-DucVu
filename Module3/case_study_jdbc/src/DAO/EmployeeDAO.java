package DAO;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    String save(Employee employee,String password);
    Employee findById(int id);
    void update(int id, Employee employee);
    void remove(int id);
    List<Employee> findByName(String employee_name);

}
