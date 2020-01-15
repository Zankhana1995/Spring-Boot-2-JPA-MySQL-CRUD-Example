package com.demo.springboot2.SpringBoot2JPACRUDexample.controller;

import com.demo.springboot2.SpringBoot2JPACRUDexample.model.Employee;
import com.demo.springboot2.SpringBoot2JPACRUDexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v2")
public class CompanyController {
    //extra controller just for understanding
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/company")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @PostMapping("companies")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
