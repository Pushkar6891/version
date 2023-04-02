package com.bharath.springdata.associations;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bharath.springdata.associations.manytomany.entities.Programmer;
import com.bharath.springdata.associations.manytomany.entities.Project;
import com.bharath.springdata.associations.manytomany.repos.ProgrammerRepository;
import com.bharath.springdata.associations.onetomany.entities.Customer;
import com.bharath.springdata.associations.onetomany.entities.PhoneNumber;
import com.bharath.springdata.associations.onetomany.repos.CustomerRepository;
import com.bharath.springdata.associations.onetoone.entities.License;
import com.bharath.springdata.associations.onetoone.entities.Person;
import com.bharath.springdata.associations.onetoone.repos.LicenseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssociationsApplicationTests {

	@Autowired
	CustomerRepository repository;

	@Autowired
	ProgrammerRepository programmerRepository;

	@Autowired
	LicenseRepository licenseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test_1_CreateCustomer() {

		Customer customer = new Customer();
		customer.setName("John");

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("1234567890");
		ph1.setType("cell");

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("0987654321");
		ph2.setType("home");

		customer.addPhoneNumber(ph1);
		customer.addPhoneNumber(ph2);

		repository.save(customer);
	}

	@Test
	@Transactional
	public void test_2_LoadCustomer() {
		Customer customer = repository.findById(1L).get();
		System.out.println(customer.getName());

		Set<PhoneNumber> numbers = customer.getNumbers();
		numbers.forEach(number -> System.out.println(number.getNumber()));

	}

	@Test
	public void test_3_UpdateCustomer() {
		Customer customer = repository.findById(1L).get();
		customer.setName("John Bush");

		Set<PhoneNumber> numbers = customer.getNumbers();
		numbers.forEach(number -> number.setType("cell"));

		repository.save(customer);

	}

	@Test
	public void test_4_Delete() {
		repository.deleteById(1l);
	}

	@Test
	public void test_5_ManytoMany_CreateProgrammer() {
		Programmer programmer = new Programmer();
		programmer.setName("John");
		programmer.setSal(10000);

		HashSet<Project> projects = new HashSet<Project>();
		Project project = new Project();
		project.setName("Hibernate Project");
		projects.add(project);

		programmer.setProjects(projects);

		programmerRepository.save(programmer);
	}

	@Test
	@Transactional
	public void test_6_ManytoMany_FindProgrammer() {
		Programmer programmer = programmerRepository.findById(1).get();
		System.out.println(programmer);
		System.out.println(programmer.getProjects());
	}

	@Test
	public void test_7_DeleteProgrammer() {
		programmerRepository.deleteById(1);
	}

	@Test
	public void test_8_OnetoOne_CreateLicense() {
		License license = new License();
		license.setType("CAR");
		license.setValidFrom(new Date());
		license.setValidTo(new Date());

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Clinton");
		person.setAge(35);

		license.setPerson(person);

		licenseRepository.save(license);
	}

	@Test
	public void test_9_DeleteLicense() {
		licenseRepository.deleteById(1L);
	}
}
