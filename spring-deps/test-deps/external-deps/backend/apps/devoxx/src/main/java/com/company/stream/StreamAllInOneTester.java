package com.company.stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAllInOneTester {
    public static void main(String[] args) {
        StreamAllInOneTester obj = new StreamAllInOneTester();
        List<Employee> employees = obj.loadEmployeesFromDatabase();

        System.out.println("\n Print Employees");
        employees.forEach(System.out::println);

        System.out.println("\n Print Employees whose age > 50");
        employees.stream().filter(e -> e.getAge() > 50).forEach(System.out::println);

        System.out.println("\n Print Employees whose name startsWith P");
        employees.stream().filter(e -> e.getName().startsWith("P")).forEach(System.out::println);

        System.out.println("\n Print Employees initial first character");
        employees.stream().map(e -> e.getName().charAt(0)).distinct().forEach(System.out::println);

        System.out.println("\n Print Employee sorted by name");
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        System.out.println("\n Print Employee sorted by name using sorted");
        List<Employee> sortedEmployeesList = employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        sortedEmployeesList.forEach(System.out::println);

        System.out.println("\n Print Employee sorted by department");
        Comparator<Employee> employeeDeptComparator = (e1, e2) -> e1.getDepartment().compareTo(e2.getDepartment());
        employees.sort(employeeDeptComparator.reversed());
        employees.forEach(System.out::println);

        System.out.println("\n Print Employee sorted by age");
        employees.sort(Comparator.comparing(Employee::getAge));
        employees.forEach(System.out::println);

        System.out.println("\n Print Employee sorted by age and salary");
        employees.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary, Comparator.reverseOrder()));
        employees.forEach(System.out::println);

        System.out.println("\n Print Employee distinct departments");
        List<Department> employeeDepartmentsList = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        employeeDepartmentsList.forEach(System.out::println);

        System.out.println("\n Print Count of Employees with high salary above 5000");
        long countOfHighSalaryEmployees = employees.stream().filter(e -> e.getSalary() > 5000).count();
        System.out.println(countOfHighSalaryEmployees);

        System.out.println("\n Print if anyMatch for Employee where name startsWith P");
        boolean anyMatch = employees.stream().anyMatch(e -> e.getName().startsWith("P"));
        System.out.println(anyMatch);

        System.out.println("\n Print if allMatch for Employee where name endsWith P");
        boolean allMatch = employees.stream().allMatch(e -> e.getName().endsWith("P"));
        System.out.println(allMatch);

        System.out.println("\n Print if noneMatch for Employee where name contains Z");
        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().contains("Z"));
        System.out.println(noneMatch);

        System.out.println("\n Print Employee Name in upperCase");
        List<String> upperCaseEmployees = employees.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseEmployees);

        System.out.println("\n Print Total Employee Salaries");
        double totalSalary = employees.stream().map(Employee::getSalary).reduce(0.0, (a, b) -> a + b);
        System.out.println(totalSalary);

        System.out.println("\n Print Total Employee Salaries");
        double totalSalary2 = employees.stream().map(Employee::getSalary).reduce(Double::sum).get();
        System.out.println(totalSalary2);

        System.out.println("\n Print Total Employee Salaries");
        double totalSalary3 = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary3);

        System.out.println("\n Print Employee with Max Salary");
        Optional<Employee> maxSalaryEmployee1 = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> maxSalaryEmployee2 = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(maxSalaryEmployee1.isPresent() ? maxSalaryEmployee1.get() : "Not Applicable");
        System.out.println(maxSalaryEmployee2.isPresent() ? maxSalaryEmployee2.get() : "Not Applicable");

        System.out.println("\n Print Employee with High Salary");
        employees.stream()
                .map(Employee::getSalary)
                .map(StreamAllInOneTester::isHighSalaryEmployee)
                .forEach(System.out::println);

        System.out.println("\n Print Employee Details by Grouping");
        Map<Department, List<Employee>> departmentListMap = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.toList()));
        departmentListMap.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("\n Print Employee Details by Grouping");
        Map<Department, List<Employee>> departmentListMap2 = employees.stream()
                .filter(e -> e.getSalary() > 5000)
           //   .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.toList()));
        departmentListMap2.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("\n Print Employee Details by Grouping");
        Map<Department, List<Employee>> departmentListMap3 = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                //   .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .collect(Collectors.groupingBy(e -> e.getDepartment(), TreeMap::new, Collectors.toList()));
        departmentListMap3.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("\n distinct by Key");
        List<Employee> distinctByKey = employees.stream().filter(distinctByKey(e -> "BANKING".equals(e.getDepartment()))).collect(Collectors.toList());
        distinctByKey.forEach(System.out::println);
    }

    public static boolean isHighSalaryEmployee(double salary) {
        return salary > 5000;
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public List<Employee> loadEmployeesFromDatabase() {
        List<Employee> employees = new LinkedList<>();

        Employee e1 = new Employee(110, "Raj", 8000.0, 45, Department.FINANCE);
        Employee e2 = new Employee(100, "Pushkar", 9000.0, 30, Department.HR);
        Employee e3 = new Employee(101, "Priya", 7000.0, 60, Department.SALES);
        Employee e4 = new Employee(102, "Aditya", 4000.0, 30, Department.MARKETING);
        Employee e5 = new Employee(109, "Vivek", 2000.0, 57, Department.IT);
        Employee e6 = new Employee(126, "Prakash", 4000.0, 30, Department.MARKETING);
        Employee e7 = new Employee(123, "Arvind", 2000.0, 57, Department.IT);
        Employee e8 = new Employee(120, "Himanshu", 8000.0, 45, Department.MANUFACTURING);
        Employee e9 = new Employee(112, "Jimmy", 9000.0, 30, Department.BANKING);
        Employee e10 = new Employee(111, "Ashok", 7000.0, 60, Department.BANKING);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        return employees;
    }
}
