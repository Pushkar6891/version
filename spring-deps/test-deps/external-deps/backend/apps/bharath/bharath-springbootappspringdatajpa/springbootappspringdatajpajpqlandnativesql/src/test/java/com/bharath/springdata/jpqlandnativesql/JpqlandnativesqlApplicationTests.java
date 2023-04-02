package com.bharath.springdata.jpqlandnativesql;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bharath.springdata.jpqlandnativesql.entities.Student;
import com.bharath.springdata.jpqlandnativesql.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JpqlandnativesqlApplicationTests {

	@Autowired
	StudentRepository repository;

	@Test
	public void test_1_StudentCreate() {
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Ferguson");
		student.setScore(88);

		Student student2 = new Student();
		student2.setFirstName("Bill");
		student2.setLastName("Gates");
		student2.setScore(75);

		repository.save(student);
		repository.save(student2);
	}

	@Test
	public void test_2_FindAllStudents() {
		// System.out.println(repository.findAllStudents(new PageRequest(0, 5,
		// Direction.DESC, "id")));
		System.out.println(repository.findAllStudents(PageRequest.of(0, 5, Sort.by("id"))));
	}

	@Test
	public void test_3_FindAllStudentsPartial() {
		List<Object[]> partialData = repository.findAllStudentsPartialData();
		for (Object[] objects : partialData) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Test
	public void test_4_FindAllStudentsByFirstName() {
		System.out.println(repository.findAllStudentsByFirstName("Bill"));
	}

	@Test
	public void test_5_FindAllStudentsByScores() {
		System.out.println(repository.findStudentsForGivenScores(80, 90));
	}

	@Test
	@Transactional
	@Rollback(false)
	public void test_6_DeleteStudentsByFirstName() {
		repository.deleteStudentsByFirstName("John");
		repository.deleteStudentsByFirstName("Bill");
	}

	@Test
	public void test_7_FindAllStudentNQ() {
		System.out.println(repository.findAllStudentNQ());
	}

	@Test
	public void test_8_FindByFirstNameNQ() {
		System.out.println(repository.findByFirstNQ("Bill"));
	}

}
