package com.company.helper;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.List;

import com.company.entity.Address;
import com.company.entity.Employee;
import com.company.entity.Gender;

public class HelperUtility {

	public Employee getEmployeeUnderTest() {

		return Employee.builder().id(Long.valueOf(1)).firstName("Pushkar").lastName("Chauhan")
				.email("pushkar.chauhan@yahoo.com").salary(1000.0).department("HR").phone("+919826396467")
				.dob(Date.valueOf(LocalDate.now(ZoneId.of("Asia/Kolkata")).minusDays(120000))).isActive(true)
				.gender(Gender.MALE).address(Address.builder().pincode("560037").city("Bangalore").state("Karnataka")
						.country("India").build())
				.build();
	}

	public List<Employee> getEmployeesUnderTest() {

		Employee firstEmployee = Employee.builder().id(Long.valueOf(1)).firstName("Pushkar").lastName("Chauhan")
				.email("pushkar.chauhan@yahoo.com").salary(1000.0).department("HR").phone("+919826396467")
				.dob(Date.valueOf(LocalDate.now(ZoneId.of("Asia/Kolkata")).plusDays(10))).isActive(true)
				.gender(Gender.MALE).address(getAddressFirstEmployee()).build();

		Employee secondEmployee = Employee.builder().id(Long.valueOf(2)).firstName("Walter").lastName("White")
				.email("walter.white@yahoo.com").salary(2000.0).department("Sales").phone("+1725207840")
				.dob(Date.valueOf(LocalDate.now(ZoneId.of("America/New_York")).plusDays(100))).isActive(true)
				.gender(Gender.MALE).address(getAddressSecondEmployee()).build();

		Employee thirdEmployee = Employee.builder().id(Long.valueOf(3)).firstName("Pierre").lastName("Guierra")
				.email("pierre.guierra@rediff.com").salary(9000.0).department("IT").phone("+33223377407")
				.dob(Date.valueOf(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(200))).isActive(true)
				.gender(Gender.MALE).address(getAddressThirdEmployee()).build();

		Employee fourthEmployee = Employee.builder().id(Long.valueOf(4)).firstName("Rita").lastName("Hayword")
				.email("rita.hayword@gmail.com").salary(7000.0).department("Sales").phone("+02088336291")
				.dob(Date.valueOf(LocalDate.now(ZoneId.of("Europe/London")).plusDays(80))).isActive(true)
				.gender(Gender.FEMALE).address(getAddressFourthEmployee()).build();

		Employee fifthEmployee = Employee.builder().id(Long.valueOf(5)).firstName("Mark").lastName("Carey")
				.email("mark.carey@gmail.com").salary(1000.0).department("HR").phone("+1354758632")
				.dob(Date.valueOf(LocalDate.now(ZoneId.of("America/New_York")).plusDays(2000))).isActive(true)
				.gender(Gender.MALE).address(getAddressFifthEmployee()).build();

		List<Employee> employees = new LinkedList<>();
		employees.add(firstEmployee);
		employees.add(secondEmployee);
		employees.add(thirdEmployee);
		employees.add(fourthEmployee);
		employees.add(fifthEmployee);
		return employees;

	}

	public Address getAddressFirstEmployee() {
		return Address.builder().pincode("560037").city("Bangalore").state("Karnataka").country("India").build();
	}

	public Address getAddressSecondEmployee() {
		return Address.builder().pincode("87111").city("Albuquerque").state("New Mexico").country("USA").build();
	}

	public Address getAddressThirdEmployee() {
		return Address.builder().pincode("75007").city("Paris").state("North Central").country("France").build();
	}

	public Address getAddressFourthEmployee() {
		return Address.builder().pincode("WC2N 5DU").city("London City").state("London").country("UK").build();
	}

	public Address getAddressFifthEmployee() {
		return Address.builder().pincode("10001").city("New York City").state("New York").country("USA").build();
	}

}
