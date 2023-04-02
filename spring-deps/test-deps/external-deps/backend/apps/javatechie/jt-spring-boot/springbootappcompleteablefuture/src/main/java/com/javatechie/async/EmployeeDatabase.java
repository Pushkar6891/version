package com.javatechie.async;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> fetchEmployees() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new ClassPathResource("employees.json").getFile();
        try {
            return mapper.readValue(file, new TypeReference<List<Employee>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}