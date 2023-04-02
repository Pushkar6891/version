package com.company.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.entity.Employee;
import com.company.entity.Gender;

public class StreamUtility {

	private final Logger LOG = LoggerFactory.getLogger(StreamUtility.class);

	private List<Employee> employees;
	private Employee[] employeeArr;

	public StreamUtility() {
		employees = new DataSource().getEmployees();
		employeeArr = employees.toArray(new Employee[employees.size()]);
	}

	public void printIntNumbersBetweenRange(int start, int end) {
		LOG.info("Printing numbers between {} and {}", start, end);
		IntStream.range(start, end).forEach((n) -> System.out.println(n));
	}

	public void printIntNumbersBetweenRangeClosed(int start, int end) {
		LOG.info("Printing numbers between {} and {}", start, end);
		IntStream.rangeClosed(start, end).forEach(System.out::println);
	}

	public void printIntNumbersBetweenRangeSkip(int start, int end) {
		LOG.info("Printing numbers between {} and {}", start, end);
		IntStream.range(start, end).skip(5).forEach((n) -> System.out.println(n));
	}

	public int printIntNumbersBetweenRangeSum(int start, int end) {
		int sum = IntStream.range(start, end).sum();
		LOG.info("Sum of numbers between {} and {} is {}", start, end, sum);
		return sum;
	}

	public int printIntNumbersBetweenRangeSumClosed(int start, int end) {
		int sum = IntStream.rangeClosed(start, end).sum();
		LOG.info("Sum of numbers between {} and {} is {}", start, end, sum);
		return sum;
	}

	public List<Employee> getEmployeesSortedByFirstNames() {
		LOG.info("Get Employees Sorted by first Names : ");
		Comparator<Employee> firstNameComparator = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
		List<Employee> sortedByFirstName = employees.stream().sorted(firstNameComparator).collect(Collectors.toList());
		return sortedByFirstName;
	}

	public void printFirstEmployeeByFirstName() {
		LOG.info("Print First Employee by firstName : ");
		Comparator<Employee> firstNameComparator = (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName());
		employees.stream().sorted(firstNameComparator).findFirst().ifPresent(System.out::println);
	}

	public List<String> getEmployeesSortedUsingArray() {
		LOG.info("Sort Employee by firstName Starting with P: ");
		List<String> sortedEmployees = Arrays.stream(employeeArr).map(Employee::getFirstName)
				.filter(e -> e.startsWith("P")).collect(Collectors.toList());
		sortedEmployees.forEach(System.out::println);
		return sortedEmployees;
	}

	public Double getSumOfSalaries() {
		Double totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
		LOG.info("Get sum of all employee salaries : {}", totalSalary);
		return totalSalary;
	}

	public Double getAverageOfSalaries() {
		Double averageSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		LOG.info("Get average of all employee salaries : {}", averageSalary);
		return averageSalary;
	}

	public Double getAverageOfSquaresOfFirst5NaturalNumbers() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		double average = Arrays.stream(numbers).map(n -> n * n).average().getAsDouble();
		LOG.info("Get average of square of for {} natural numbers : {}", 5, average);
		return average;
	}

	public List<String> streamMapFilterPrint() {
		LOG.info("Print First Employee by firstName : ");
		List<String> sortedEmployees = Arrays.stream(employeeArr).map(Employee::getFirstName).map(String::toLowerCase)
				.filter(e -> e.startsWith("p")).sorted().collect(Collectors.toList());
		sortedEmployees.forEach(System.out::println);
		return sortedEmployees;
	}

	public List<String> streamFilesFilterByLength() throws IOException {
		Stream<String> cricketers = Files.lines(Paths.get("src/main/resources/cricketers.txt"));
		List<String> filteredCricketers = cricketers.sorted().filter(x -> x.length() > 13)
				.filter(x -> x.contains("Singh")).collect(Collectors.toList());
		cricketers.close();
		return filteredCricketers;
	}

	public List<String> streamFilesFilterByLengthThenReverseNames() throws IOException {
		Stream<String> cricketers = Files.lines(Paths.get("src/main/resources/cricketers.txt"));
		List<String> filteredCricketers = cricketers.sorted().filter(x -> x.length() > 13)
				.filter(x -> x.contains("Singh")).map(name -> new StringBuilder(name).reverse().toString())
				.collect(Collectors.toList());
		cricketers.close();
		return filteredCricketers;
	}

	public long streamFilesFindFileLength() throws IOException {
		Stream<String> trains = Files.lines(Paths.get("src/main/resources/weather.txt"));
		long count = trains.map(row -> row.split(",")).filter(x -> x.length == 3).count();
		trains.close();
		return count;
	}

	public void streamFilesFilterPrint() throws IOException {
		Stream<String> trains = Files.lines(Paths.get("src/main/resources/weather.txt"));
		trains.map(row -> row.split(",")).filter(x -> x.length == 3)
				.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		trains.close();
	}

	public Map<String, Double> streamFilesFilterAverageWeather() throws IOException {
		Stream<String> weather = Files.lines(Paths.get("src/main/resources/weather.txt"));
		Map<String, Double> map = weather.map(row -> row.split(",")).filter(x -> x.length == 3)
				.filter(x -> Double.parseDouble(x[1]) >= 40)
				.collect(Collectors.toMap(x -> x[0], x -> (Double.parseDouble(x[1]) + Double.parseDouble(x[2])) / 2));
		weather.close();
		return map;
	}

	public double reductionSum() {
		Double reducedTotal = employees.stream().map(Employee::getSalary).reduce(0.0, (Double a, Double b) -> a + b);
		return reducedTotal;
	}

	public double[] reductionSummaryStatistics() {
		IntSummaryStatistics summaryStatistics = IntStream.of(4, 1, 3, 2, 5).summaryStatistics();
		double average = summaryStatistics.getAverage();
		long count = summaryStatistics.getCount();
		int min = summaryStatistics.getMin();
		int max = summaryStatistics.getMax();
		long sum = summaryStatistics.getSum();
		double stats[] = new double[5];
		stats[0] = average;
		stats[1] = count;
		stats[2] = min;
		stats[3] = max;
		stats[4] = sum;
		return stats;
	}

	public Set<Gender> getGenders() {
		Set<Gender> genders = employees.stream().map(employee -> employee.getGender()).collect(Collectors.toSet());
		return genders;
	}

	public void getLengthOfEmployeeName() {
		employees.stream().map(employee -> employee.getFirstName()).mapToInt(String::length)
				.forEach(System.out::println);
	}

	public boolean areAllEmployeedMale() {
		return employees.stream().allMatch(employee -> employee.getGender().equals(Gender.MALE));
	}

	public boolean areAllEmployeedFemale() {
		return employees.stream().allMatch(employee -> employee.getGender().equals(Gender.FEMALE));
	}

	public boolean isThereAnyMaleEmployee() {
		return employees.stream().anyMatch(employee -> employee.getGender().equals(Gender.MALE));
	}

	public boolean isThereAnyFemaleEmployee() {
		return employees.stream().anyMatch(employee -> employee.getGender().equals(Gender.FEMALE));
	}

	public boolean noneMatchEmployee() {
		return employees.stream().noneMatch(employee -> employee.getGender().equals(Gender.OTHER));
	}

	public List<Employee> getFemaleEmployees() {
		return employees.stream().filter(employee -> employee.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
	}

	public List<Employee> getEmployeesSortedByAscSalary() {
		return employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	}

	public List<Employee> getEmployeesSortedByDscSalary() {
		return employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
	}

	public List<Employee> getEmployeesSortedByFirstNameAndThenSalary() {
		return employees.stream()
				.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());
	}

	public boolean areAllEmployeesHavingSalaryLesserThan10K(List<Employee> employees) {
		return employees.stream().allMatch(employee -> employee.getSalary() < 10000);
	}

	public boolean anyEmployeesHavingFirstNameStartingWithP() {
		return employees.stream().anyMatch(employeeArr -> employeeArr.getFirstName().startsWith("P"));
	}

	public boolean anyEmployeesHavingLastNameStartingWithSingh() {
		return employees.stream().noneMatch(employeeArr -> employeeArr.getLastName().equals("Singh"));
	}

	public String getFirstNameOfEmployeeWithMaxSalary(List<Employee> employees) {
		Optional<Employee> maxSalaryEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary));
		return maxSalaryEmployee.isPresent() ? maxSalaryEmployee.get().getFirstName() : "Not Applicable";
	}

	public String getFirstNameOfEmployeeWithMinSalary(List<Employee> employees) {
		Optional<Employee> maxSalaryEmployee = employees.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		return maxSalaryEmployee.isPresent() ? maxSalaryEmployee.get().getFirstName() : "Not Applicable";
	}

	public void groupByGender() {
		employees.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((gender, employee) -> {
			System.out.println(gender);
			employee.forEach(System.out::println);
			System.out.println();
		});
	}

	public double groupByGenderFindHighestMaleEmployeeSalary(List<Employee> employees) {
		Optional<Double> oldestMaleSalary = employees.stream()
				.filter(employee -> employee.getGender().equals(Gender.MALE))
				.max(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary);
		return oldestMaleSalary.isPresent() ? oldestMaleSalary.get() : Double.MIN_VALUE;
	}
}
