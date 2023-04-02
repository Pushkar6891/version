package com.company.oops.composition;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CompositionTester {
    public static void main(String[] args) {
        Address homeAddress = new Address("India", "MP", "Indore", "452016");
        Customer customer = new Customer("Pushkar", homeAddress);
        Address workAddress = new Address("India", "Karnataka", "Bangalore", "560103");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}

@ToString
class Customer {
    // state
    private String customerName;
    private Address homeAddress;
    private Address workAddress;

    // creating
    public Customer(String customerName, Address homeAddress) {
        this.customerName = customerName;
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

}

@ToString
@Getter
@Setter
class Address {
    private String country;
    private String state;
    private String city;
    private String zipCode;

    public Address(String country, String state, String city, String zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }
}
