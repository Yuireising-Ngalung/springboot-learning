package com.example.springLearning.modal;

public class EmployeeModal {

    private int empId;
    private String empName;
    private String empAddress;
    private String empDepartment;
    private double empSalary;

    public EmployeeModal(int empId, String empName, String empAddress, String empDepartment, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
