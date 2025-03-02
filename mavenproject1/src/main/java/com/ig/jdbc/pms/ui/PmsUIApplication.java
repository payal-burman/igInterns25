package com.ig.jdbc.pms.ui;

import java.util.List;
import java.util.Scanner;

import com.ig.jdbc.pms.model.Employee;
import com.ig.jdbc.pms.service.EmployeeService;
import com.ig.jdbc.pms.service.EmployeeServiceImpl;

public class PmsUIApplication {
    public static void main(String[] args) throws Exception {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. List All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1: // Add Employee
                    Employee newEmployee = new Employee();
                    System.out.print("Enter Employee ID: ");
                    newEmployee.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    newEmployee.setName(sc.nextLine());
                    System.out.print("Enter Employee Salary: ");
                    newEmployee.setSalary(sc.nextDouble());

                    employeeService.addEmployee(newEmployee);
                    System.out.println("✅ Employee Added Successfully!");
                    break;

                case 2: // Get Employee by ID
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    Employee emp = employeeService.getEmployeeById(empId);
                    if (emp != null) {
                        System.out.println("Employee Details: " + emp);
                    } else {
                        System.out.println("❌ Employee Not Found!");
                    }
                    break;

                case 3: // Update Employee
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    Employee updateEmp = employeeService.getEmployeeById(updateId);
                    
                    if (updateEmp != null) {
                        System.out.print("Enter New Name: ");
                        updateEmp.setName(sc.nextLine());
                        System.out.print("Enter New Salary: ");
                        updateEmp.setSalary(sc.nextDouble());

                        employeeService.updateEmployee(updateEmp);
                        System.out.println("✅ Employee Updated Successfully!");
                    } else {
                        System.out.println("❌ Employee Not Found!");
                    }
                    break;

                case 4: // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    employeeService.deleteEmployee(deleteId);
                    System.out.println("✅ Employee Deleted Successfully!");
                    break;

                case 5: // List All Employees
                    List<Employee> employees = employeeService.listAllEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("No employees found!");
                    } else {
                        System.out.println("\n=== Employee List ===");
                        employees.forEach(System.out::println);
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid Choice! Please try again.");
            }
        }
    }
}