package BO;

import model.Employee;

import java.util.List;

public interface EmployeeBO {
    List<Employee> findAll();
    String save(Employee employee);
    Employee findById(int id);
    void update(int id, Employee employee);
    void remove(int id);
    List<Employee> findByName(String employee_name);
}
