package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student tanle = new Student(
                "Tanle",
                LocalDate.of(2000, Month.APRIL, 22),
                "tanle905@gmail.com"
            );
            Student tantran = new Student(
                    "TanTran",
                    LocalDate.of(1997, Month.APRIL, 22),
                    "tatran905@gmail.com"
            );
            repository.saveAll(
                    List.of(tanle, tantran)
            );
        };
    }
}
