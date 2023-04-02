package com.company.hamcrest.beans;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    void testProduct() {
        Product iPhoneX = Product.builder().name("IPhone").price(1000.0).build();
        Product iPhoneXR = Product.builder().name("IPhone").price(1000.0).build();
        Product samsung = Product.builder().name("Samsung").price(1500.0).build();

        MatcherAssert.assertThat(iPhoneX, Matchers.hasProperty("name"));
        MatcherAssert.assertThat(iPhoneX, Matchers.hasProperty("name", Matchers.equalTo("IPhone")));
        MatcherAssert.assertThat(iPhoneX, Matchers.samePropertyValuesAs(iPhoneXR));
        MatcherAssert.assertThat(iPhoneXR, Matchers.not(Matchers.samePropertyValuesAs(samsung)));

    }
}
