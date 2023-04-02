package com.company.javaspringboottutorial.service;

import com.company.javaspringboottutorial.repository.StudentRepository;
import com.company.javaspringboottutorial.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Pushkar",
                        "pushkarchauhan91@gmail.com",
                        Gender.MALE
                )
        );
    }
     */

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email already taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean isStudentIdExist = studentRepository.existsById(studentId);
        if (!isStudentIdExist) {
            throw new IllegalStateException("student with studentId " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Optional<Student> optionalStudent = Optional.ofNullable(studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("student with studentId " + studentId + " does not exist")));
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            if (!Objects.isNull(name) && name.length() > 0 &&
                    !Objects.equals(student.getName(), name)) {
                student.setName(name);
            }
            if (!Objects.isNull(email) && email.length() > 0 &&
                    !Objects.equals(student.getEmail(), email)) {
                Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
                if (studentOptional.isPresent()) {
                    throw new IllegalStateException("Email already taken");
                }
                student.setEmail(email);
            }
        }
    }
}
