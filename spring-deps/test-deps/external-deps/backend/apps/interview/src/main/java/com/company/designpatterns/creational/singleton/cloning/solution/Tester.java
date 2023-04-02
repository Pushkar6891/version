package com.company.designpatterns.creational.singleton.cloning.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tester {

    private static final Logger LOG = LoggerFactory.getLogger(Tester.class);

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee1 = Employee.getInstance();
        Employee employee2 = (Employee) employee1.clone();

        LOG.info("Employee 1 hashCode : {}", employee1.hashCode());
        LOG.info("Employee 2 hashCode : {}", employee2.hashCode());

    }
}
