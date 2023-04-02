package com.company.junit5.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.company.junit5.basics.AssertionsDemo;
import com.company.junit5.basics.AssumptionsDemo;
import com.company.junit5.basics.DisabledClassDemo;

@RunWith(JUnitPlatform.class)
//@SelectPackages("com.company.junit5.basics")
@SelectClasses({ AssertionsDemo.class, AssumptionsDemo.class, DisabledClassDemo.class })
public class BasicTestSuite {

}
