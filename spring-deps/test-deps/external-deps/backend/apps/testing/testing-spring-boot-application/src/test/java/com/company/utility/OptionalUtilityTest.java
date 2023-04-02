package com.company.utility;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;

@TestMethodOrder(OrderAnnotation.class)
class OptionalUtilityTest {

	private OptionalUtility obj;
	private Employee employee;

	@BeforeEach
	void setUp() {
		obj = new OptionalUtility();
		employee = new HelperUtility().getEmployeeUnderTest();
	}

	@Test
	void test_optional_1() {
		assertNotNull(obj.optional_1());
	}

	@Test
	void test_optional_2() {
		assertNotNull(obj.optional_2());
		assertThat("Some Value").isEqualTo(obj.optional_2());
	}

	@Test
	void test_optional_3() {
		obj.optional_3(employee.getEmail(), employee.getFirstName(), employee.getLastName());
	}

	@Test
	void test_optional_4_success() {
		obj.optional_4(employee.getEmail(), employee.getFirstName(), employee.getLastName());
	}

	@Test
	void test_optional_4_else() {
		obj.optional_4(null, employee.getFirstName(), employee.getLastName());
	}

//	@Test
//	void testOptional() {
//		Optional<Object> empty = Optional.empty();
//		assertThat(false).isEqualTo(empty.isPresent());
//		assertThat(true).isEqualTo(empty.isEmpty());
//
//		empty = Optional.of("Hello");
//		assertThat(true).isEqualTo(empty.isPresent());
//		assertThat(false).isEqualTo(empty.isEmpty());
//		assertThat("Hello").isEqualTo(empty.orElse("Hello"));
//
//		assertThrows(NullPointerException.class, () -> Optional.of(null));
//		assertDoesNotThrow(() -> Optional.ofNullable(null));
//
//		Optional<String> helloStr = Optional.ofNullable("hello");
//		assertThat(true).isEqualTo(helloStr.isPresent());
//		assertThat(false).isEqualTo(helloStr.isEmpty());
//
//		String orElseGetHelloStr = helloStr.map(String::toUpperCase).orElseGet(() -> {
//			return "World";
//		});
//		assertThat("HELLO").isEqualTo(orElseGetHelloStr);
//
//		Optional<String> nullStr = Optional.ofNullable(null);
//		assertThat(false).isEqualTo(nullStr.isPresent());
//		assertThat(true).isEqualTo(nullStr.isEmpty());
//
//		String orElseGetNullStr = nullStr.map(String::toUpperCase).orElseGet(() -> {
//			return "World";
//		});
//		assertThat("World").isEqualTo(orElseGetNullStr);
//		assertThrows(IllegalStateException.class,
//				() -> nullStr.map(String::toUpperCase).orElseThrow(IllegalStateException::new));
//
//		nullStr.ifPresent(word -> {
//			System.out.println(word);
//		});
//
//		nullStr.ifPresent(System.out::println);
//
//		helloStr.ifPresent(word -> {
//			System.out.println(word);
//		});
//
//		helloStr.ifPresent(System.out::println);
//
//		nullStr.ifPresentOrElse(System.out::println, () -> System.out.println("Else From nullStr"));
//		helloStr.ifPresentOrElse(System.out::println, () -> System.out.println("Else from helloStr"));
//	}
//
//	@Test
//	void nullCaseOptional() {
//		assertThat("PUSHKAR.CHAUHAN@YAHOO.COM").isEqualTo(employee.getEmail().toUpperCase());
//		employee.setEmail(null);
//		assertThrows(NullPointerException.class, () -> employee.getEmail().toUpperCase());
//	}
}
