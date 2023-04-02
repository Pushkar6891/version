package com.company.javafunctionalprogramming.validation;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@")
                ? ValidationResult.SUCCESS : ValidationResult.EMAIL_INVALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+91")
                ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_INVALID;
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18
                ? ValidationResult.SUCCESS : ValidationResult.NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }


}
