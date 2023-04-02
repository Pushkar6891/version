package com.basant.json.parse.controller;

import com.basant.json.parse.service.CountryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

	@Autowired
	private CountryService service;

	@SuppressWarnings("unchecked")
	@GetMapping("/getCountryNames")
	public List<String> getCountryNames() throws JsonProcessingException {
		String expression = "$.Countries[*].Country";
		return (List<String>) service.getFormatedResponse(expression, List.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/getCountries")
	public List<Object> getCountries() throws JsonProcessingException {
		// String expression1 = "$.Countries[*]";
		String expression2 = "$.Countries[*].Data";
		return (List<Object>) service.getFormatedResponse(expression2, List.class);
	}

}
