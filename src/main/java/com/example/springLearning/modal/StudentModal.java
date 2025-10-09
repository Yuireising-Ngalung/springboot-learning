package com.example.springLearning.modal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentModal {
    private int studId;
    @NotBlank(message = "Name can't be empty")
    @Size(min = 3, max = 50, message = "Student Name must be atLeast 3 character and max 50 character")
    private String studName;

    @NotBlank(message = "Department can't be empty")
    @Size(min = 3, max = 20, message = "Department must be atLeast 3 character and max 20 character")
    private String studDept;

    @NotBlank(message = "Address can't be empty")
    private String studAdd;

    public StudentModal(int studId, String studName, String studDept, String studAdd) {
        this.studId = studId;
        this.studName = studName;
        this.studDept = studDept;
        this.studAdd = studAdd;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudDept() {
        return studDept;
    }

    public void setStudDept(String studDept) {
        this.studDept = studDept;
    }

    public String getStudAdd() {
        return studAdd;
    }

    public void setStudAdd(String studAdd) {
        this.studAdd = studAdd;
    }
}
