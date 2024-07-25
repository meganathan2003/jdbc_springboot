package com.example.SpringJDBCEx.repo;


import com.example.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * This files contains the repo like
 * intract with the database
 *
 */

@Repository
public class StudentRepo {

    public static List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;

    }

    public void save(Student s) {
        System.out.println("saved in the database");
    }
}
