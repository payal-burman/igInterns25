package com.ig.jdbc.pms.service;

import java.util.List;
import com.ig.jdbc.pms.dao.EmployeeDao;
import com.ig.jdbc.pms.dao.EmployeeDaoImpl;
import com.ig.jdbc.pms.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeServiceImpl() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void addEmployee(Employee employee) throws Exception {
        employeeDao.addEmployee(employee);
    }

    @Override
    public List<Employee> listAllEmployees() throws Exception {
        return employeeDao.listAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) throws Exception {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public void updateEmployee(Employee employee) throws Exception {
        employeeDao.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) throws Exception {
        employeeDao.deleteEmployee(id);
    }
}