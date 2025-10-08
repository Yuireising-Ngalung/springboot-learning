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

    public String updateEmployee(int id, EmployeeModal employeeModal) {
        for(EmployeeModal employee : employees){
            if(employee.getEmpId() == id){
                employee.setEmpId(employeeModal.getEmpId());
                employee.setEmpName(employeeModal.getEmpName());
                employee.setEmpAddress(employeeModal.getEmpAddress());
                employee.setEmpDepartment(employeeModal.getEmpDepartment());
                employee.setEmpSalary(employeeModal.getEmpSalary());

                return "Employee Details update successfully";
            }
        }

        return "No Record found with Employee ID: " + id;
    }

    public String deleteEmployee(int id) {
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).getEmpId() == id){
                employees.remove(i);
                return "Employee Record Deleted Successfully";
            }
        }
        return "No Record found with Employee ID: " + id;
    }
}
