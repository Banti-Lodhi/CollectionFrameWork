package com.SpringSystem.services;

import com.SpringSystem.entity.Employees;;
import com.SpringSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServices(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employees> getAllEmployee() {
        return employeeRepository.findAll();
    }

public Employees getEmpById(Long id) {
        return employeeRepository.findById(id).orElseGet(null);
}

public Employees createEmp(Employees employees) {
        return employeeRepository.save(employees);
}

public Employees updateEmployee(Long id, Employees employeesDetails) {
        Employees employee = employeeRepository.findById(id).orElse(null);

        if(employee != null) {
            employee.setName(employeesDetails.getName());
            employee.setEmail(employeesDetails.getEmail());
            employee.setDepartment(employeesDetails.getDepartment());
            return employeeRepository.save(employee);
        }
        return null;
}
public Employees deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
    return null;
}
}
