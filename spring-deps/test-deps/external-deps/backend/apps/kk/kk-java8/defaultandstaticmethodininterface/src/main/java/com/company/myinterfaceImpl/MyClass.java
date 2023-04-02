package com.company.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.company.model.Student;
import com.company.myinterface.MyInterface;

public class MyClass extends Object implements MyInterface {

    @Override
    public Integer getMaxNum(List<Integer> intList) {
        Integer maxNum = Collections.max(intList);
        return maxNum;
    }

    public List<Student> sortStudents(List<Student> stuList) {
        return stuList;
    }

}
