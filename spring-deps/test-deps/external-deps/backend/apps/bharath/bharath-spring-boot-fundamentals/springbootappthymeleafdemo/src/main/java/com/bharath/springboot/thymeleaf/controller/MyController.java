package com.bharath.springboot.thymeleaf.controller;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.springboot.thymeleaf.model.Student;

@Controller
public class MyController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView modelAndView = new ModelAndView("data");
		modelAndView.addObject("message", "Honesty is the best policy!");
		return modelAndView;
	}

	@RequestMapping("/getStudentDetails")
	public ModelAndView getStudentDetails() {
		ModelAndView modelAndView = new ModelAndView("student");
		modelAndView.addObject("student", new Student(1L, "Pushkar", 90.0));
		return modelAndView;
	}

	@RequestMapping("/getStudentsDetails")
	public ModelAndView getStudentsDetails() {
		ModelAndView modelAndView = new ModelAndView("students");
		Student student1 = new Student(1L, "Pushkar", 90.0);
		Student student2 = new Student(2L, "Sachin", 94.0);
		Student student3 = new Student(3L, "Pooja", 98.0);
		List<Student> students = new LinkedList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		modelAndView.addObject("students", students);
		return modelAndView;
	}

	@RequestMapping("/displayStudentForm")
	public ModelAndView displayStudentForm() {
		ModelAndView modelAndView = new ModelAndView("studentForm");
		Student student = new Student();
		student.setId(1L);
		student.setName("Pushkar Chauhan");
		student.setMarks(90.00);
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView("result");
		LOGGER.info("Student Id: {}", student.getId());
		LOGGER.info("Student Name: {}", student.getName());
		LOGGER.info("Student Marks: {}", student.getMarks());
		return modelAndView;
	}
}
