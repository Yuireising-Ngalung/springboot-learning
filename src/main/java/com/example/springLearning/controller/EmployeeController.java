package com.example.springLearning.controller;

import com.example.springLearning.modal.EmployeeModal;
import com.example.springLearning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<EmployeeModal> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("employees/addEmployee")
    public List<EmployeeModal> addEmployee(@RequestBody EmployeeModal employeeModal){
        return employeeService.addEmployee(employeeModal);
    }

    @PutMapping("employees/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody EmployeeModal employeeModal){
        return employeeService.updateEmployee(id, employeeModal);
    }

    @DeleteMapping("employees/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}
