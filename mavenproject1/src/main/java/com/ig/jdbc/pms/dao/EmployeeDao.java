package com.ig.jdbc.pms.dao;

import java.util.List;
import com.ig.jdbc.pms.model.Employee;

public interface EmployeeDao {  
    public void addEmployee(Employee employee) throws Exception;
    public List<Employee> listAllEmployees() throws Exception;
    Employee  getEmployeeById(int id) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(int id) throws Exception;
}
