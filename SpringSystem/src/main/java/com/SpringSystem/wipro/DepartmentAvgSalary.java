package com.SpringSystem.wipro;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentAvgSalary {
    public static Map<String, Double> getMaxSalary(List<Employee> employees) {
        if(employees == null || employees.isEmpty()) {
            return Collections.emptyMap();
        }
        return employees.stream().filter(emp -> emp.getDepartment() != null)
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 90000.67, "Engineering"),
                new Employee("Bob", 75000.45, "HR"),
                new Employee("Charlie", 120000.35, "Engineering"),
                new Employee("David", 85000.23, "Finance"),
                new Employee("Eve", 110000.45, "Engineering"),
                new Employee("Frank", 80000.65, "HR")
        );

        Map<String, Double> avgSalaryByDept = getMaxSalary(employees);

        System.out.println("Average Salary by Department:");
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.printf("%s: %.2f%n", dept, avg));
    }
}
