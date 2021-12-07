package com.pratise.githubcopilot.service;

import com.pratise.githubcopilot.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1,"Pratik", "pratikaambani@gmail.com"));
    }

    public List<Student> getAllEmployees() {
        return students;
    }

    public Student getEmployee(int id) {
        return students.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public void addEmployee(Student student) {
        students.add(student);
    }

    public void updateEmployee(Student student) {
        Student e = getEmployee(student.getId());
        e.setName(student.getName());
        e.setEmail(student.getEmail());
    }

    public void deleteEmployee(int id) {
        students.removeIf(e -> e.getId() == id);
    }

}
