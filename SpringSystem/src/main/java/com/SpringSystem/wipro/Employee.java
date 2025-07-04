package com.SpringSystem.wipro;

public class Employee {
    private String name;
    private Double salary;
    private String department;

    public Employee(String name, Double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "Employee name{='"+name+"', salary= "+salary+", department='"+department+"'}";
    }
}
