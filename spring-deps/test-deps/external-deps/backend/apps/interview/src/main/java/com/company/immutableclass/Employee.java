package com.company.immutableclass;

import lombok.ToString;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@ToString
final public class Employee {
    private final long id;
    private final String empName;
    private final List<String> phoneNumbers;
    private final Address address;

    public Employee(
            long id,
            String empName,
            Address address,
            List<String> phoneNumbers
    ) {
        this.id = id;
        this.empName = empName;
        this.address = address;
        this.phoneNumbers = Collections.unmodifiableList(new LinkedList<String>(phoneNumbers));
    }

    public long getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

//    public Address getAddress() {
//        return address;
//    }

//    Single Responsibility Principle is overruled
//    public Address getAddress() {
//        return new Address(address.getCity(), address.getState());
//    }

//    Using Copy Constructor and new // Return a defensive copy or cloned copy
//    public Address getAddress() {
//        return new Address(address);
//    }

    // Using Copy Constructor and getInstance
    public Address getAddress() {
        return Address.getInstance(address);
    }

}
