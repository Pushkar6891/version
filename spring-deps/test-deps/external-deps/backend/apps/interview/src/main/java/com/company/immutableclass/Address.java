package com.company.immutableclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Address {

    private String city;
    private String state;
    private String country;

    public Address(
            String city,
            String state,
            String country
    ) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Copy Constructor + Constructor Chaining
    public Address(Address address) {
        this(address.getCity(), address.getState(), address.getCountry());
    }

    // Custom getInstance
    public static Address getInstance(Address address) {
        return new Address(address.getCity(), address.getState(), address.getCountry());
    }
}
