package com.example.gurucharanq1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq1.model.Student;
import com.example.gurucharanq1.model.StudentInfo;
import com.example.gurucharanq1.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public StudentInfo postMethodName(@RequestBody StudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<Student> getMethodName() {
        return studentService.getStudents();
    }
    
}