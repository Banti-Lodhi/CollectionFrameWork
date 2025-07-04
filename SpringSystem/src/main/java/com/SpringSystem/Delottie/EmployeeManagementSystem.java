package com.SpringSystem.Delottie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> result = Arrays.asList(
            new Employee(1, "mike", 20, "male",
                    "Id Department", 2023, 55000),
                new Employee(2, "mike1", 21, "female",
                        "Id Department2", 2023, 45000),
                new Employee(3, "mike2", 22, "male",
                        "Id Department", 2023, 65000),
                new Employee(4, "mike3", 23, "female",
                        "Id Department", 2023, 75000),
                new Employee(5, "mike4", 24, "male",
                        "Id Department3", 2023, 35000),
                new Employee(6, "mike5", 25, "female",
                        "Id Department", 2023, 25000),
                new Employee(7, "mike6", 26, "male",
                        "Id Department5", 2023, 15000),
                new Employee(8, "mike7", 27, "female",
                        "Id Department", 2023, 85000)
                );

        Map<String, List<Employee>> collect = result.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employee By Department"+collect);
    }

}
