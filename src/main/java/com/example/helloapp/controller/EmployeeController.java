package com.example.helloapp.controller;

import com.example.helloapp.entity.Employee;
import com.example.helloapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


    private final EmployeeService service;

    public EmployeeController(EmployeeService employeeService){
        this.service=employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return service.getEmployeeById(id);
    }


}
