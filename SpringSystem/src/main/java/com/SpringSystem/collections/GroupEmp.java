package com.SpringSystem.collections;

import java.util.*;

class Employee {
    String name;
    String Department;
    public Employee(String name, String department) {
        this.name = name;
        this.Department = department;
    }

    public String getDepartment() {
        return Department;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class GroupEmp {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("alice", "HR"),
                new Employee("shyam", "client"),
                new Employee("mike", "HR"),
                new Employee("reyansh", "client")
        );
        Map<String, List<Employee>> departmentGroup = new HashMap<>();

        for(Employee emp: employeeList) {
            departmentGroup.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }
        System.out.println("Group of department"+ departmentGroup);
    }
}
