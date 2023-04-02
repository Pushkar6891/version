package com.company.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestMinimal1.class, TestMinimal2.class })
public class MySuite {

}
