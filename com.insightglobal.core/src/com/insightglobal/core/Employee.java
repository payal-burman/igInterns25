package com.insightglobal.core;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String firstname;
    private String lastname;

    public Employee(int empid, String firstname, String lastname) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getEmpid() {
        return empid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Employee other) {
        // Default sorting by empid
        return Integer.compare(this.empid, other.empid);
    }

    @Override
    public String toString() {
        return "Employee{empid=" + empid + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
    }

    // Overriding equals and hashCode to prevent duplicates based on empid
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }
}
