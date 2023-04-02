package com.company.mockito;

import com.company.Udemyspringbootunittestingluv2codeApplication;
import com.company.dao.ApplicationDao;
import com.company.model.CollegeStudent;
import com.company.model.StudentGrades;
import com.company.service.ApplicationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = Udemyspringbootunittestingluv2codeApplication.class)
public class MockAnnotationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private CollegeStudent collegeStudentOne;

    @Autowired
    private StudentGrades studentGrades;

    @Mock
    private ApplicationDao applicationDao;

    @InjectMocks
    private ApplicationService applicationService;

    @BeforeEach
    void beforeEach() {
        collegeStudentOne.setFirstname("Pushkar");
        collegeStudentOne.setLastname("Chauhan");
        collegeStudentOne.setEmailAddress("pushkarchauhan91@gmail.com");
        collegeStudentOne.setStudentGrades(studentGrades);
    }

    @Test
    @DisplayName("When & Verify")
    void testAssertEqualsTestAddGrades() {
        Mockito.when(applicationDao.addGradeResultsForSingleClass(studentGrades.getMathGradeResults())).thenReturn(100.0);
        Assertions.assertEquals(100, applicationService.addGradeResultsForSingleClass(collegeStudentOne.getStudentGrades().getMathGradeResults()));
        Mockito.verify(applicationDao, Mockito.times(1)).addGradeResultsForSingleClass(studentGrades.getMathGradeResults());
    }

}
