package com.company.junit5.basics;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisabledClassDemo {
    @Test
    void testWillBeSkipped() {
    	System.out.println("testWillBeSkipped");
    }
    
    @Test
    void testWillBeExecuted() {
    	System.out.println("testWillBeExecuted");
    }
    
    @Test
    void test1() {
    	System.out.println("test 1");
    }
    
    @Test
    void test2() {
    	System.out.println("test 2");
    }
    
    @Test
    void test3() {
    	System.out.println("test 2");
    }
}
