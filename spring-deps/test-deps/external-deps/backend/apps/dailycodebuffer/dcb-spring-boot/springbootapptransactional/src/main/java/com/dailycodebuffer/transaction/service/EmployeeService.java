package com.dailycodebuffer.transaction.service;

import com.dailycodebuffer.transaction.entity.Department;
import com.dailycodebuffer.transaction.entity.Employee;
import com.dailycodebuffer.transaction.repository.DepartmentRepository;
import com.dailycodebuffer.transaction.repository.EmployeeRepository;
import com.dailycodebuffer.transaction.vo.EmployeeRequestVO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    public String saveEmployee(EmployeeRequestVO employeeRequestVO) {

        Department department  = Department.builder()
							        	   .departmentName(employeeRequestVO.getDepartmentName())
							        	   .departmentCode(employeeRequestVO.getDepartmentName())
							        	   .build();

        Long departmentId = departmentRepository.save(department)
                            					.getDepartmentId();

        Employee  employee = Employee.builder()
					        		 .empName(employeeRequestVO.getEmpName())
					        		 .email(employeeRequestVO.getEmail())
					        		 .departmentId(departmentId)
					        		 .build();
        
//        Employee employee = null;

        employeeRepository.save(employee);

        return "Employee is saved with Employee ID :" + employee.getEmployeeId();
    }
}
