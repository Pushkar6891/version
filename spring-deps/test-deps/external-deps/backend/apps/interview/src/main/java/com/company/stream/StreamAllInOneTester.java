package com.company.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.*;

public class StreamAllInOneTester {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        System.out.println("\nStream Empty");
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
        System.out.println("\nStream Creation using Stream.of()");
        Stream<String> ofStringStream = Stream.of("Mathew Hayden", "KL Rahul", "Brett Lee", "Glenn Mcgrath");
        ofStringStream.forEach(System.out::println);
        System.out.println("\nStream Creation using Arrays.stream()");
        String[] cricketers = new String[]{"Mathew Hayden", "KL Rahul", "Brett Lee", "Glenn Mcgrath"};
        Stream<String> stringStream = Arrays.stream(cricketers);
        stringStream.forEach(System.out::println);
        System.out.println("\nStream Creation using Collection");
        List<String> cricketersList = new LinkedList<>(Arrays.asList("Mathew Hayden", "KL Rahul", "Brett Lee", "Glenn Mcgrath", "Adam Milne"));
        cricketersList.forEach(System.out::println);
        System.out.println("\nStream Builder");
        Stream<Object> metroStream = Stream.builder().add("Delhi").add("Mumbai").build();
        metroStream.forEach(System.out::println);
        System.out.println("\nStream Generate");
        Stream<String> streamGenerate = Stream.generate(() -> "element").limit(10);
        streamGenerate.forEach(System.out::println);
        System.out.println("\nStream Infinite Stream");
        Stream<Integer> iterate = Stream.iterate(10, i -> i * 2);
        List<Integer> collect = iterate.limit(10).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("\nStream using Primitive : IntStream range()");
        IntStream.range(0, 5).forEach(System.out::println);
        System.out.println("\nStream using Primitive : IntStream rangeClosed() both start and end inclusive");
        IntStream.rangeClosed(0, 5).forEach(System.out::println);
        System.out.println("\nStream using Primitive : LongStream range()");
        LongStream.range(0, 5).forEach(System.out::println);
        System.out.println("\nStream using Primitive : LongStream rangeClosed() both start and end inclusive");
        LongStream.rangeClosed(0, 5).forEach(System.out::println);
        System.out.println("\nStream using Primitive : DoubleStream of()");
        DoubleStream.of(3.14, 2.71).forEach(System.out::println);
        System.out.println("\nParallel Stream");
        cricketersList.parallelStream().forEach(System.out::println);
        System.out.println("\nParallel Stream doProcess()");
        cricketersList.forEach(StreamAllInOneTester::doProcess);
        System.out.println("\nStream intermediate operations : distinct() and count()");
        long countOfUniqueElements = cricketersList.stream().distinct().count();
        System.out.println(countOfUniqueElements);
        System.out.println("\nStream intermediate operations : skip()");
        long countOfUniqueElementsSkip = cricketersList.stream().skip(2).distinct().count();
        System.out.println(countOfUniqueElementsSkip);
        System.out.println("\nStream Filtering List");
        List<String> startsWithMSList = cricketersList.stream().filter(e -> e.startsWith("MS")).collect(Collectors.toList());
        startsWithMSList.forEach(System.out::println);
        System.out.println("\nStream Filtering Set");
        Set<String> startsWithMSSet = cricketersList.stream().filter(e -> e.startsWith("MS")).collect(Collectors.toSet());
        startsWithMSSet.forEach(System.out::println);
        System.out.println("\nStream Terminal Operation : anyMatch");
        boolean anyMatch = cricketersList.stream().anyMatch(e -> e.startsWith("MS"));
        System.out.println(anyMatch);
        System.out.println("\nStream Terminal Operation : allMatch");
        boolean allMatch = cricketersList.stream().allMatch(e -> e.startsWith("MS"));
        System.out.println(allMatch);
        System.out.println("\nStream Terminal Operation : noneMatch");
        boolean noneMatch = cricketersList.stream().noneMatch(e -> e.startsWith("MS"));
        System.out.println(noneMatch);
        System.out.println("\nStream Mapping : reverseString()");
        List<String> reversedNamesList = cricketersList.stream().map(StreamAllInOneTester::reverseString).collect(Collectors.toList());
        reversedNamesList.forEach(System.out::println);
        System.out.println("\nStream Map : map()");
        List<String> highScorersNamesList = employees.stream().filter(e -> e.getSalary() > 20000).map(Employee::getEmpName).collect(Collectors.toList());
        highScorersNamesList.forEach(System.out::println);
        System.out.println("\nStream Map : flatMap()");
        List<String> highScorersPhoneNumbersList = employees.stream().filter(e -> e.getSalary() > 20000).flatMap(e -> e.getPhoneNumbers().stream()).collect(Collectors.toList());
        highScorersPhoneNumbersList.forEach(System.out::println);
        System.out.println("\nStream Map : toUpperCase()");
        List<String> highScorersNamesUppercaseList = employees.stream().filter(e -> e.getSalary() > 20000).map(Employee::getEmpName).map(String::toUpperCase).collect(Collectors.toList());
        highScorersNamesUppercaseList.forEach(System.out::println);
        System.out.println("\nStream Reduction : reduce()");
        List<Double> scoresList = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
//      Double totalScores = scoresList.stream().reduce(0.0, (a, b) -> a + b);
        Double totalScores = scoresList.stream().reduce(0.0, Double::sum);
        System.out.println(totalScores);
        System.out.println("\nStream Reduction : collect(Collectors.joining())");
        String playersCollect = employees.stream().map(Employee::getEmpName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(playersCollect);
        System.out.println("\nStream Reduction : collect(Collectors.averagingDouble())");
        Double employeeCollectAverage = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(employeeCollectAverage);
        System.out.println("\nStream Reduction : collect(Collectors.averagingDouble())");
        Double averageSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(averageSalary);
        System.out.println("\nStream Reduction : collect(Collectors.summarizingDouble())");
        DoubleSummaryStatistics doubleSummaryStatistics = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(doubleSummaryStatistics);
        System.out.println("\nStream Reduction : collect(Collectors.groupingBy())");
        Map<Double, List<Employee>> collectCache = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
        collectCache.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(doubleSummaryStatistics);
        System.out.println("\nStream Sorting : Asc");
        List<Employee> salaryAscList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        salaryAscList.forEach(System.out::println);
        System.out.println("\nStream Sorting : Desc");
        List<Employee> salaryDescList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        salaryDescList.forEach(System.out::println);
        System.out.println("\nStream partitioningBy()");
        Map<Boolean, List<Employee>> employeeCache = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 20000));
        employeeCache.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("\nStream additional transformation");
        Set<Employee> employeeSet = employees.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
        employeeSet.forEach(System.out::println);
        System.out.println("\nHow many males and females in organization?");
        Map<String, Long> noOfMaleAndFemaleEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
        System.out.println("\nDisplay all departments in organization");
        Set<String> departmentsSet = employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        List<String> departmentsList = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(departmentsSet);
        System.out.println(departmentsList);
        System.out.println("\nAverage age of male and female employees in organization?");
        Map<String, Double> averageAgeOfMaleAndFemaleEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//      averageAgeOfMaleAndFemaleEmployees.entrySet().forEach(entry -> {
//          System.out.println(entry.getKey() + " " + entry.getValue());
//      });
        averageAgeOfMaleAndFemaleEmployees.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nDisplay employee details with highest salary");
//      Optional<Employee> employeeWithHighestSalary1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
        Optional<Employee> employeeWithHighestSalary1 = employees.stream().max(Comparator.comparing(Employee::getSalary));
//      Optional<Employee> employeeWithHighestSalary2 = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Optional<Employee> employeeWithHighestSalary2 = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        if (employeeWithHighestSalary1.isPresent()) {
            System.out.println(employeeWithHighestSalary1.get());
        } else {
            System.out.println("Not Found");
        }
        if (employeeWithHighestSalary2.isPresent()) {
            System.out.println(employeeWithHighestSalary1.get());
        } else {
            System.out.println("Not Found");
        }
        System.out.println("\nDisplay all employees who joined in 2015");
        employees.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getEmpName).forEach(System.out::println);
        System.out.println("\nCount number of employees in each department");
        Map<String, Long> noOfEmployeesInEachDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(noOfEmployeesInEachDepartment);
        System.out.println("\nAverage Salary of Each Department");
        Map<String, Double> averageSalaryOfEachDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        averageSalaryOfEachDepartment.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nDisplay details of youngest male employee in Product Development department");
        Optional<Employee> optionalYoungestEmployeeInProductDevelopment = employees.stream().filter(e -> "Male".equals(e.getGender()) && "Product Development".equals(e.getDepartment())).min(Comparator.comparingInt(Employee::getAge));
        if (optionalYoungestEmployeeInProductDevelopment.isPresent()) {
            System.out.println(optionalYoungestEmployeeInProductDevelopment.get());
        } else {
            System.out.println("Not Found");
        }
        System.out.println("\nWho has most working experience in organization?");
        Optional<Employee> optionalMostExperienceEmployee = employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        if (optionalMostExperienceEmployee.isPresent()) {
            System.out.println(optionalMostExperienceEmployee.get());
        } else {
            System.out.println("Not Found");
        }
//      optionalMostExperienceEmployee = employees.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        optionalMostExperienceEmployee = employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        if (optionalMostExperienceEmployee.isPresent()) {
            System.out.println(optionalMostExperienceEmployee.get());
        } else {
            System.out.println("Not Found");
        }
        System.out.println("\nHow many male and female in Sales And Marketing department? ");
        Map<String, Long> howManyMaleAndFemaleInSalesAndMarketingDepartment = employees.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment()))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        howManyMaleAndFemaleInSalesAndMarketingDepartment.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nWhat is average salary of male and female employees?");
        Map<String, Double> averageSalaryOfMaleAndFemaleEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        averageSalaryOfMaleAndFemaleEmployees.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nList of all employees in each department");
        Map<String, List<Employee>> employeeListByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        employeeListByDepartment.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nAverage Salary and Total Salary of Whole Organization?");
        DoubleSummaryStatistics doubleSummaryStatisticsEmployee = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(doubleSummaryStatisticsEmployee);
        System.out.println("\nSeparate Employees greater than 25 and less than 25");
        Map<Boolean, List<Employee>> employeesGreaterThan25AndLesserThan25 = employees.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        employeesGreaterThan25AndLesserThan25.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nOldest Employee in organization, his age and department");
        Optional<Employee> optionalOldestEmployee1 = employees.stream().max(Comparator.comparingInt(Employee::getAge));
//      Optional<Employee> optionalOldestEmployee2 = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst();
        Optional<Employee> optionalOldestEmployee2 = employees.stream().max(Comparator.comparingInt(Employee::getAge));
        if (optionalOldestEmployee1.isPresent()) {
            Employee oldestEmployee = optionalOldestEmployee1.get();
            System.out.println(oldestEmployee.getEmpName() + " " + oldestEmployee.getAge() + " " + oldestEmployee.getDepartment());
        } else {
            System.out.println("Not Found");
        }
        if (optionalOldestEmployee2.isPresent()) {
            Employee oldestEmployee = optionalOldestEmployee2.get();
            System.out.println(oldestEmployee.getEmpName() + " " + oldestEmployee.getAge() + " " + oldestEmployee.getDepartment());
        } else {
            System.out.println("Not Found");
        }
        System.out.println("\nDisplay Employee details based on department");
        Map<Integer, List<Employee>> employeeListBasedOnDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));
        employeeListBasedOnDepartment.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("\nDisplay count of active and inactive employees");
        long activeEmployeeCount = employees.stream().filter(e -> "active".equals(e.getStatus())).count();
        long inactiveEmployeeCount = employees.stream().filter(e -> "inactive".equals(e.getStatus())).count();
        System.out.println("Active Employee Count : " + activeEmployeeCount);
        System.out.println("Inactive Employee Count : " + inactiveEmployeeCount);
        System.out.println("\nDisplay Max Salary from each department");
        Map<Integer, Optional<Employee>> departmentWiseMaxSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        departmentWiseMaxSalary.forEach((departmentId, highestEarningEmployeeOptional) -> {
            if (highestEarningEmployeeOptional.isPresent()) {
                Employee highestEarningEmployee = highestEarningEmployeeOptional.get();
                System.out.println("Department : " + departmentId + " " + " has Highest Earning Employee : " + highestEarningEmployee);
            }
        });
    }

    private static void doProcess(String s) {
        System.out.println(s);
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
