package com.javatechie.spring.validate.api;

import javax.validation.Valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class FormValidationApplication {

	@GetMapping("/")
	public String showForm(Person person) {
		return "register";
	}

	@PostMapping("/")
	public String register(@Valid Person person, Errors errors, Model model) {
		if (errors.hasErrors()) {
			return "register";
		} else {
			model.addAttribute("message", "Registration successfully...");
			return "register";
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(FormValidationApplication.class, args);
	}
}
