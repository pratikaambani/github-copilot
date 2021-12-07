package com.pratise.githubcopilot.controller;

import com.pratise.githubcopilot.model.Student;
import com.pratise.githubcopilot.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public List<Student> getAllEmployees() {
        return studentService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Student getEmployeeById(@PathVariable int id) {
        return studentService.getEmployee(id);
    }

}
