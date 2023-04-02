package com.company;

import com.company.model.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootappstreamapijavaeightApplication {

    private static List<Employee> employees = new LinkedList<>();

    static {
        employees.add(new Employee("Pushkar", "Chauhan", 5000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Sachin", "Tendulkar", 2000.0, List.of("Project 3", "Project 4")));
        employees.add(new Employee("Rahul", "Dravid", 8000.0, List.of("Project 2", "Project 3")));
    }

    public static void main(String[] args) {
        System.out.println("\n All Emp Salary");
        employees.stream().forEach(employee -> System.out.println(employee));
        System.out.println("\n Increase Emp Salary");
        List<Employee> employeesWithIncreasedSalary = employees.stream().map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.1, employee.getProjects()))
                .collect(Collectors.toList());
        System.out.println(employeesWithIncreasedSalary);
        System.out.println("\n Filtered Employees Salary");
        List<Employee> filteredEmployees = employees.stream().filter(employee -> employee.getSalary() > 6000.0).map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.1, employee.getProjects()))
                .collect(Collectors.toList());
        System.out.println(filteredEmployees);
        System.out.println("\n FlatMap");
        String flatMapEmployees = employees.stream().map(employee -> employee.getProjects()).flatMap(str -> str.stream()).collect(Collectors.joining(","));
        System.out.println(flatMapEmployees);
        List<Employee> shortCircuitEmployees = employees.stream().skip(1).limit(1).collect(Collectors.toList());
        System.out.println("\n Short Circuit Employees");
        System.out.println(shortCircuitEmployees);
        System.out.println("Finite Data Stream");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        System.out.println("\n Sorting");
        List<Employee> sortedEmployees = employees.stream().sorted((e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName())).collect(Collectors.toList());
        System.out.println(sortedEmployees);
        System.out.println("\n Max Salary");
        Employee employeeMaxSal = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
        System.out.println(employeeMaxSal);
        System.out.println("\n Sum of all salary");
        Double sum = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println(sum);
    }

}
