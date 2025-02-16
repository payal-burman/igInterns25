package com.insightglobal.core;

import java.util.*;

public class EmployeeManager {

    // Method to create and store Employee objects in a Set
    public Set<Employee> createEmployeeSet() {
        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee(101, "John", "Doe"));
        employeeSet.add(new Employee(102, "Jane", "Smith"));
        employeeSet.add(new Employee(103, "Alice", "Johnson"));
        employeeSet.add(new Employee(104, "Bob", "Brown"));
        employeeSet.add(new Employee(105, "Charlie", "Davis"));
        employeeSet.add(new Employee(106, "Eve", "Martinez"));

        return employeeSet;
    }

    // Method to sort employees by empid (Comparable interface)
    public void sortByEmpid(Set<Employee> employeeSet) {
        List<Employee> employeeList = new ArrayList<>(employeeSet); // Convert to List for sorting
        Collections.sort(employeeList); // Sorting using Comparable
        System.out.println("Employees Sorted by empid:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // Method to sort employees by firstname (Comparator interface)
    public void sortByFirstname(Set<Employee> employeeSet) {
        List<Employee> employeeList = new ArrayList<>(employeeSet); // Convert to List for sorting
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getFirstname().compareTo(e2.getFirstname()); // Sorting by firstname
            }
        });
        System.out.println("\nEmployees Sorted by Firstname:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Create a set of employees (no duplicates)
        Set<Employee> employees = manager.createEmployeeSet();

        // Display the original set of employees
        System.out.println("Original Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort employees by empid
        manager.sortByEmpid(employees);

        // Sort employees by firstname
        manager.sortByFirstname(employees);
    }
}
