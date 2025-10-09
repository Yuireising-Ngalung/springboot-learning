package com.example.springLearning.controller;


import com.example.springLearning.modal.StudentModal;
import com.example.springLearning.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("students")
    public List<StudentModal> getAllStudent(){
        return service.getAllStudent();
    }

    @PostMapping("addStudent")
    public StudentModal addStudent(@Valid @RequestBody StudentModal studentModal){
        return service.addStudent(studentModal);
    }

}
