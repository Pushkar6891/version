package com.company.utility;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;

@TestMethodOrder(OrderAnnotation.class)
class StreamUtilityTest {

	private StreamUtility underTest;
	private List<Employee> employees;

	@BeforeEach
	void setUp() {
		underTest = new StreamUtility();
		employees = new HelperUtility().getEmployeesUnderTest();
	}

	@Test
	@Order(1)
	void printIntNumbersBetweenRange() {
		int start = 1;
		int end = 10;
		underTest.printIntNumbersBetweenRange(start, end);
	}

	@Test
	@Order(2)
	void printIntNumbersBetweenRangeClosed() {
		int start = 1;
		int end = 10;
		underTest.printIntNumbersBetweenRangeClosed(start, end);
	}

	@Test
	@Order(3)
	void printIntNumbersBetweenRangeSkip() {
		int start = 1;
		int end = 10;
		underTest.printIntNumbersBetweenRangeSkip(start, end);
	}

	@Test
	@Order(4)
	void printIntNumbersBetweenRangeSum() {
		int start = 1;
		int end = 10;
		assertThat(45).isEqualTo(underTest.printIntNumbersBetweenRangeSum(start, end));
	}

	@Test
	@Order(5)
	void printIntNumbersBetweenRangeSumClosed() {
		int start = 1;
		int end = 10;
		assertThat(55).isEqualTo(underTest.printIntNumbersBetweenRangeSumClosed(start, end));
	}

	@Test
	@Order(6)
	void getEmployeesSortedByFirstNames() {
		List<Employee> sortedEmployees = underTest.getEmployeesSortedByFirstNames();
		assertThat(sortedEmployees.get(0).getFirstName()).isEqualTo("Mark");
	}

	@Test
	@Order(7)
	void printFirstEmployeeByFirstName() {
		underTest.printFirstEmployeeByFirstName();
	}

	@Test
	@Order(8)
	void getEmployeesSortedUsingArray() {
		List<String> employeesSortedUsingArray = underTest.getEmployeesSortedUsingArray();
		assertThat(employeesSortedUsingArray.size()).isEqualTo(2);
		assertThat(employeesSortedUsingArray.get(0)).isEqualTo("Pushkar");
		assertThat(employeesSortedUsingArray.get(1)).isEqualTo("Pierre");
	}

	@Test
	@Order(9)
	void getSumOfSalaries() {
		assertThat(20000.0).isEqualTo(underTest.getSumOfSalaries());
	}

	@Test
	@Order(10)
	void getAverageOfSalaries() {
		assertThat(4000.0).isEqualTo(underTest.getAverageOfSalaries());
	}

	@Test
	@Order(10)
	void getAverageOfSquaresOfFirst5NaturalNumbers() {
		assertThat(11.0).isEqualTo(underTest.getAverageOfSquaresOfFirst5NaturalNumbers());
	}

	@Test
	@Order(11)
	void streamMapFilterPrint() {
		List<String> result = underTest.streamMapFilterPrint();
		assertThat(2).isEqualTo(result.size());
		assertThat(result.get(0)).isEqualTo("pierre");
		assertThat(result.get(1)).isEqualTo("pushkar");
	}

	@Test
	@Order(12)
	void streamFilesFilterByLength() throws IOException {
		List<String> filteredCricketers = underTest.streamFilesFilterByLength();
		assertThat(2).isEqualTo(filteredCricketers.size());
		assertThat(filteredCricketers.get(0)).isEqualTo("Harbhajan Singh");
		assertThat(filteredCricketers.get(1)).isEqualTo("Mahendra Singh Dhoni");
	}

	@Test
	@Order(12)
	void streamFilesFilterByLengthThenReverseNames() throws IOException {
		List<String> filteredCricketers = underTest.streamFilesFilterByLengthThenReverseNames();
		assertThat(2).isEqualTo(filteredCricketers.size());
		assertThat(filteredCricketers.get(0)).isEqualTo("hgniS najahbraH");
		assertThat(filteredCricketers.get(1)).isEqualTo("inohD hgniS ardnehaM");
	}

	@Test
	@Order(13)
	void streamFilesFindFileLength() throws IOException {
		long rowCount = underTest.streamFilesFindFileLength();
		assertEquals(5, rowCount);
	}

	@Test
	@Order(14)
	void streamFilesFilterPrint() throws IOException {
		underTest.streamFilesFilterPrint();
	}

	@Test
	@Order(15)
	void streamFilesFilterPrintAverageWeather() throws IOException {
		Map<String, Double> weatherCache = underTest.streamFilesFilterAverageWeather();
		assertThat(weatherCache.size()).isEqualTo(2);
		assertThat(weatherCache.get("chennai")).isEqualTo(43);
		assertThat(weatherCache.get("jaipur")).isEqualTo(44);
	}

	@Test
	@Order(16)
	void reductionSum() {
		assertThat(20000.0).isEqualTo(underTest.reductionSum());
	}

	@Test
	@Order(17)
	void reductionSummaryStatistics() {
		double[] stats = underTest.reductionSummaryStatistics();
		assertThat(3.0).isEqualTo(stats[0]);
		assertThat(5.0).isEqualTo(stats[1]);
		assertThat(1.0).isEqualTo(stats[2]);
		assertThat(5.0).isEqualTo(stats[3]);
		assertThat(15.0).isEqualTo(stats[4]);
	}

	@Test
	@Order(18)
	void getGenders() {
		assertThat(2).isEqualTo(underTest.getGenders().size());
	}

	@Test
	@Order(19)
	void getLengthOfEmployeeName() {
		underTest.getLengthOfEmployeeName();
	}

	@Test
	@Order(20)
	void areAllEmployeesMale() {
		assertThat(false).isEqualTo(underTest.areAllEmployeedMale());
	}

	@Test
	@Order(21)
	void areAllEmployeesFemale() {
		assertThat(false).isEqualTo(underTest.areAllEmployeedFemale());
	}

	@Test
	@Order(22)
	void isThereAnyMaleEmployee() {
		assertThat(true).isEqualTo(underTest.isThereAnyMaleEmployee());
	}

	@Test
	@Order(23)
	void isThereAnyFemaleEmployee() {
		assertThat(true).isEqualTo(underTest.isThereAnyFemaleEmployee());
	}

	@Test
	@Order(24)
	void noneMatchEmployee() {
		assertThat(true).isEqualTo(underTest.noneMatchEmployee());
	}

	@Test
	@Order(25)
	void getFemaleEmployees() {
		assertThat(1).isEqualTo(underTest.getFemaleEmployees().size());
	}

	@Test
	@Order(26)
	void getEmployeesSortedByAscSalary() {
		List<Employee> employeesSortedByAscSalary = underTest.getEmployeesSortedByAscSalary();
		assertNotNull(employeesSortedByAscSalary);
		employeesSortedByAscSalary.forEach(System.out::println);
		assertThat("Pushkar").isEqualTo(employeesSortedByAscSalary.get(0).getFirstName());
	}

	@Test
	@Order(27)
	void getEmployeesSortedByDscSalary() {
		List<Employee> employeesSortedByDscSalary = underTest.getEmployeesSortedByDscSalary();
		assertNotNull(employeesSortedByDscSalary);
		employeesSortedByDscSalary.forEach(System.out::println);
		assertThat("Pierre").isEqualTo(employeesSortedByDscSalary.get(0).getFirstName());
	}

	@Test
	@Order(28)
	void getEmployeesSortedByNameAndThenSalary() {
		List<Employee> employeesSortedByFirstNameAndThenSalary = underTest.getEmployeesSortedByFirstNameAndThenSalary();
		assertNotNull(employeesSortedByFirstNameAndThenSalary);
		employeesSortedByFirstNameAndThenSalary.forEach(System.out::println);
		assertThat("Mark").isEqualTo(employeesSortedByFirstNameAndThenSalary.get(0).getFirstName());
	}

	@Test
	@Order(29)
	void areAllEmployeesHavingSalaryLesserThan10K() {
		assertThat(true).isEqualTo(underTest.areAllEmployeesHavingSalaryLesserThan10K(employees));
		employees.get(0).setSalary(11000.0);
		assertThat(false).isEqualTo(underTest.areAllEmployeesHavingSalaryLesserThan10K(employees));
		assertThat(true).isEqualTo(underTest.areAllEmployeesHavingSalaryLesserThan10K(Collections.emptyList()));
	}

	@Test
	@Order(30)
	void anyEmployeesHavingFirstNameStartingWithP() {
		assertThat(true).isEqualTo(underTest.anyEmployeesHavingFirstNameStartingWithP());
	}

	@Test
	@Order(31)
	void anyEmployeesHavingLastNameStartingWithSingh() {
		assertThat(true).isEqualTo(underTest.anyEmployeesHavingLastNameStartingWithSingh());
	}

	@Test
	@Order(32)
	void getFirstNameOfEmployeeWithMaxSalary() {
		assertThat("Pierre").isEqualTo(underTest.getFirstNameOfEmployeeWithMaxSalary(employees));
	}

	@Test
	@Order(33)
	void getFirstNameOfEmployeeWithMaxSalary_negativescenario() {
		assertThat("Not Applicable").isEqualTo(underTest.getFirstNameOfEmployeeWithMaxSalary(Collections.emptyList()));
	}

	@Test
	@Order(34)
	void getFirstNameOfEmployeeWithMinSalary() {
		assertThat("Pushkar").isEqualTo(underTest.getFirstNameOfEmployeeWithMinSalary(employees));
	}

	@Test
	@Order(35)
	void getFirstNameOfEmployeeWithMinSalary_negativescenario() {
		assertThat("Not Applicable").isEqualTo(underTest.getFirstNameOfEmployeeWithMinSalary(Collections.emptyList()));
	}

	@Test
	@Order(36)
	void groupByGender() {
		underTest.groupByGender();
	}

	@Test
	@Order(37)
	void groupByGenderFindHighestMaleEmployeeSalary() {
		assertThat(9000.0).isEqualTo(underTest.groupByGenderFindHighestMaleEmployeeSalary(employees));
	}

	@Test
	@Order(38)
	void groupByGenderFindHighestMaleEmployeeSalary_negativescenario() {
		assertThat(Double.MIN_VALUE)
				.isEqualTo(underTest.groupByGenderFindHighestMaleEmployeeSalary(Collections.emptyList()));
	}
}
