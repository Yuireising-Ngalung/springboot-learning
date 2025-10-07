package com.example.springLearning.service;

import com.example.springLearning.modal.EmployeeModal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    List<EmployeeModal> employees = new ArrayList<>(
            Arrays.asList(
                    new EmployeeModal(101,"Deva", "Chennai", "IT", 25000),
                    new EmployeeModal(102, "Karuppasamy", "Chennai", "Full Stack Developer", 30000),
                    new EmployeeModal(103, "Dharun", "Chennai", "Java Developer", 35000)
            )
    );

    public List<EmployeeModal> getAllEmployee(){
        return employees;
    }

    public List<EmployeeModal> addEmployee(EmployeeModal employeeModal) {
        employees.add(employeeModal);
        return employees;
    }
}
