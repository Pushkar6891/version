package com.company;

import com.company.entity.Gender;
import com.company.entity.Student;
import com.company.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student pushkar = Student.builder()
                    .name("Pushkar")
                    .email("pushkarchauhan91@gmail.com")
                    .gender(Gender.MALE)
                    .build();
            Student amit = Student.builder()
                    .name("Amit")
                    .email("amit.yadav@gmail.com")
                    .gender(Gender.MALE)
                    .build();
            List students = new LinkedList<>();
            students.add(pushkar);
            students.add(amit);
            studentRepository.saveAll(students);
        };
    }
}
