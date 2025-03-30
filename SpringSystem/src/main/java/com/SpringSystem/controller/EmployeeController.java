package com.SpringSystem.controller;

import com.SpringSystem.entity.Employees;
import com.SpringSystem.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/emp")
public class EmployeeController {
    private EmployeeServices employeeServices;

    @Autowired
    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @GetMapping("/allEmp")
    public List<Employees> getEmployees() {
        return employeeServices.getAllEmployee();
    }
    @GetMapping("/getById/{id}")
    public Employees getEmpById(@PathVariable Long id) {
      return employeeServices.getEmpById(id);
    }
    @PostMapping("/CreateEmp")
    public Employees createEmp(@RequestBody Employees employees) {
        return employeeServices.createEmp(employees);
    }
    @PutMapping("/updateData/{id}")
    public Employees updateEmp(@PathVariable Long id, @RequestBody Employees employeesDetails) {
          return employeeServices.updateEmployee(id, employeesDetails);
    }
@DeleteMapping("/deleteEmp/{id}")
public Employees deleteEmp(@PathVariable Long id) {
        return employeeServices.deleteEmployee(id);
}
}
