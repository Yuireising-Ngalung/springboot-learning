package com.example.springLearning.service;

import com.example.springLearning.modal.StudentModal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<StudentModal> students = new ArrayList<>();

    public List<StudentModal> getAllStudent(){
        return students;
    }

    public StudentModal addStudent(StudentModal studentModal){
        students.add(studentModal);
        return studentModal;
    }
}
