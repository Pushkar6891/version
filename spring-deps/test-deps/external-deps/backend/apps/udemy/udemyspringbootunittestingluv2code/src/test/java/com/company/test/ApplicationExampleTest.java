package com.company.test;

import com.company.Udemyspringbootunittestingluv2codeApplication;
import com.company.model.CollegeStudent;
import com.company.model.StudentGrades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest(classes = Udemyspringbootunittestingluv2codeApplication.class)
class ApplicationExampleTest {

    private static int counter = 0;

    @Value("${info.app.name}:My Super Cool Gradebook")
    private String appInfo;

    @Value("${info.app.description}:a fun way to track student grades!")
    private String appDescription;

    @Value("${info.app.version}:1.0.0")
    private String appVersion;

    @Value("${info.school.name}:luv2code")
    private String schoolName;

    @Autowired
    private CollegeStudent collegeStudent;

    @Autowired
    private StudentGrades studentGrades;

    @Autowired
    private ApplicationContext applicationContext;

    @BeforeEach
    void beforeEach() {
        counter++;
        System.out.println("Testing : " + appInfo + " which is " + appDescription +
                " Version: " + appVersion + " Execution of test method " + " with school name : " + schoolName + counter);
        collegeStudent.setFirstname("Pushkar");
        collegeStudent.setLastname("Chauhan");
        collegeStudent.setEmailAddress("pushkarchauhan91@gmail.com");
        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0, 85.0, 76.50, 91.75)));
        collegeStudent.setStudentGrades(studentGrades);
    }

    @Test
    @DisplayName("Add grade results for student grades")
    void addGradeResultsForStudentGrades() {
        Assertions.assertEquals(353.25, studentGrades.addGradeResultsForSingleClass(
                collegeStudent.getStudentGrades().getMathGradeResults()
        ));
    }

    @Test
    @DisplayName("Add grade results for student grades not equals")
    void addGradeResultsForStudentGradesAssertNotEquals() {
        Assertions.assertNotEquals(0, studentGrades.addGradeResultsForSingleClass(
                collegeStudent.getStudentGrades().getMathGradeResults()
        ));
    }

    @Test
    @DisplayName("is grade greater")
    void isGradeGreaterStudentGradesAssertTrue() {
        Assertions.assertTrue(studentGrades.isGradeGreater(90, 75), "failure - should be true");
    }

    @Test
    @DisplayName("is grade greater false")
    void isGradeGreaterStudentGradesAssertFalse() {
        Assertions.assertFalse(studentGrades.isGradeGreater(89, 92), "failure - should be false");
    }

    @Test
    @DisplayName("Check Null for Student Grades")
    void checkNullForStudentGrades() {
        Assertions.assertNotNull(studentGrades.checkNull(collegeStudent.getStudentGrades().getMathGradeResults()), "Object should not be null");
    }

    @Test
    @DisplayName("Create Student without grade init")
    void createStudentWithoutGradesInit() {
        CollegeStudent collegeStudentTwo = applicationContext.getBean("collegeStudent", CollegeStudent.class);
        collegeStudentTwo.setFirstname("Chad");
        collegeStudentTwo.setLastname("Darby");
        collegeStudentTwo.setEmailAddress("chad.darby@gmail.com");
        Assertions.assertNotNull(collegeStudentTwo.getFirstname());
        Assertions.assertNotNull(collegeStudentTwo.getLastname());
        Assertions.assertNotNull(collegeStudentTwo.getEmailAddress());
        Assertions.assertNull(studentGrades.checkNull(collegeStudentTwo.getStudentGrades()));
    }

    @Test
    @DisplayName("Verify students are prototypes")
    void verifyStudentPrototypes() {
        CollegeStudent collegeStudentTwo = applicationContext.getBean("collegeStudent", CollegeStudent.class);
        Assertions.assertNotSame(collegeStudent, collegeStudentTwo);
    }

    @Test
    @DisplayName("Find Grade Point Average")
    void findGradePointAverage() {
        Assertions.assertAll("Testing all Assertions.assertEquals()",
                () -> Assertions.assertEquals(353.25, studentGrades.addGradeResultsForSingleClass(
                        collegeStudent.getStudentGrades().getMathGradeResults()
                )),
                () -> Assertions.assertEquals(88.31, studentGrades.findGradePointAverage(
                        collegeStudent.getStudentGrades().getMathGradeResults()
                )));
    }

    @Test
    void basicTest() {

    }
}
