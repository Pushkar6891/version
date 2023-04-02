package com.company.javaspringboottutorial.config;

import com.company.javaspringboottutorial.entity.Gender;
import com.company.javaspringboottutorial.repository.StudentRepository;
import com.company.javaspringboottutorial.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student pushkar = new Student(
                    "Pushkar",
                    "pushkarchauhan91@gmail.com",
                    Gender.MALE
            );
            Student amit = new Student(
                    "Amit",
                    "amit@gmail.com",
                    Gender.MALE
            );
            studentRepository.saveAll(
                    List.of(pushkar, amit)
            );
        };
    }
}
