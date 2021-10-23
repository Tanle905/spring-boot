package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(
                4566,
                "Tanle",
                20,
                LocalDate.of(2000, Month.APRIL, 22),
                "tanle905@gmail.com"
        ));
    }
}
