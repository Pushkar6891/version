package com.bharath.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		/*Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Bob");
		employee.setLastName("Ferguson");*/
		//int result = dao.create(employee);
		//int result = dao.update(employee);
		//int result = dao.delete(1);
		//Employee employee = dao.read(2);
		List<Employee> result = dao.read();
		System.out.println("Employee Record: " + result);

	}

}
