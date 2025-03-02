package com.ig.jdbc.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ig.jdbc.pms.model.Employee;
import com.ig.jdbc.pms.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {  
    public void addEmployee(Employee employee) throws Exception {
        Connection con = DbUtil.getConnection();
        PreparedStatement pst = con.prepareStatement("INSERT INTO employee values (?, ?, ?)");
            pst.setInt(1, employee.getId());
            pst.setString(2, employee.getName());
            pst.setDouble(3, employee.getSalary());
            pst.executeUpdate();
        }
    
    public List<Employee> listAllEmployees() throws Exception {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Connection con = DbUtil.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from employee");
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setSalary(rs.getDouble(3));
                employeeList.add(employee);
            }
        
        return employeeList;
    }
    public Employee getEmployeeById(int id) throws Exception {
        Connection con = DbUtil.getConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM employee WHERE id = ?");
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setSalary(rs.getDouble("salary"));
            return employee;
        } else {
            throw new Exception("Employee not found with ID: " + id);
        }
    }
    
    public void updateEmployee(Employee employee) throws Exception {
        Connection con = DbUtil.getConnection();
        PreparedStatement pst = con.prepareStatement("UPDATE employee SET name = ? WHERE id = ?");
        pst.setString(1, employee.getName());
        pst.setInt(2, employee.getId());
        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated == 0) {
            throw new Exception("No employee found with ID: " + employee.getId());
        }
    }
    
    public void deleteEmployee(int id) throws Exception {
        Connection con = DbUtil.getConnection();
        PreparedStatement pst = con.prepareStatement("DELETE FROM employee WHERE id = ?");
        pst.setInt(1, id);
        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted == 0) {
            throw new Exception("No employee found with ID: " + id);
        }
    }
}

