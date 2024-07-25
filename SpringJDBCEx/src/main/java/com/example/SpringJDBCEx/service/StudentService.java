package com.example.SpringJDBCEx.service;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student s){
        studentRepo.save(s);
    }

    public static List<Student> getStudents() {
        return StudentRepo.findAll(); // This is JPA find all method
    }
}
