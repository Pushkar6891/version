package com.dailycodebuffer.transaction.controller;

import com.dailycodebuffer.transaction.service.EmployeeService;
import com.dailycodebuffer.transaction.vo.EmployeeRequestVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody EmployeeRequestVO employeeRequestVO){
        return employeeService.saveEmployee(employeeRequestVO);
    }
}
