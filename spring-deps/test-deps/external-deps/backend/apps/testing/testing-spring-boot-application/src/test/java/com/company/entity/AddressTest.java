package com.company.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Address.AddressBuilder;
import com.company.helper.HelperUtility;

class AddressTest {

	private HelperUtility helperUtility;
	private Address obj1;
	private Address obj2;

	@BeforeEach
	void setUp() {
		helperUtility = new HelperUtility();
		obj1 = helperUtility.getAddressFirstEmployee();
		obj2 = helperUtility.getAddressSecondEmployee();
	}

	@Test
	void test_obj() {
		assertNotNull(obj1);
		assertNotNull(obj2);
	}

	@Test
	void test_builder() {
		AddressBuilder addressBuilder1 = Address.builder();
		AddressBuilder addressBuilder2 = Address.builder();
		assertNotNull(addressBuilder1.toString());
		assertNotNull(addressBuilder2.toString());
	}

	@Test
	void test_toString() {
		Address address = new Address();
		address.setPincode("560001");
		address.setCity("Bangalore");
		address.setCountry("India");
		address.setState("KA");
		assertNotNull(address.toString());
		assertNotNull(obj1.toString());
		assertNotNull(obj2.toString());
	}
}
