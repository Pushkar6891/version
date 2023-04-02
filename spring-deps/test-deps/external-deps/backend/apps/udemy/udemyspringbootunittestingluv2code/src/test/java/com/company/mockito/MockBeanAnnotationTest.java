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
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = Udemyspringbootunittestingluv2codeApplication.class)
public class MockBeanAnnotationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private CollegeStudent collegeStudentOne;

    @Autowired
    private StudentGrades studentGrades;

    //@Mock
    @MockBean
    private ApplicationDao applicationDao;

    //@InjectMocks
    @Autowired
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

    @Test
    @DisplayName("Find GPA")
    void testAssertEqualsTestFindGpa() {
        Mockito.when(applicationDao.findGradePointAverage(studentGrades.getMathGradeResults())).thenReturn(88.31);
        Assertions.assertEquals(88.31, applicationService.findGradePointAverage(collegeStudentOne.getStudentGrades().getMathGradeResults()));
    }

    @Test
    @DisplayName("Not Null")
    void testAssertNotNull() {
        Mockito.when(applicationDao.checkNull(studentGrades.getMathGradeResults())).thenReturn(Boolean.TRUE);
        Assertions.assertNotNull(applicationService.checkNull(collegeStudentOne.getStudentGrades().getMathGradeResults()), "Object Should not be null");
    }

    @Test
    @DisplayName("Throw runtime exception")
    void testRuntimeException() {
        CollegeStudent collegeStudent = (CollegeStudent) applicationContext.getBean("collegeStudent");
        Mockito.doThrow(new RuntimeException()).when(applicationDao).checkNull(collegeStudent);
        Assertions.assertThrows(RuntimeException.class, () -> {
            applicationService.checkNull(collegeStudent);
        });
        Mockito.verify(applicationDao, Mockito.times(1)).checkNull(collegeStudent);
    }

    @Test
    @DisplayName("Multiple Stubbing")
    void stubbingConsecutiveCalls() {
        CollegeStudent collegeStudent = (CollegeStudent) applicationContext.getBean("collegeStudent");
        Mockito.when(applicationDao.checkNull(collegeStudent))
                .thenThrow(new RuntimeException())
                .thenReturn("Do not throw exception second time");
        Assertions.assertThrows(RuntimeException.class, () -> {
            applicationService.checkNull(collegeStudent);
        });
        Assertions.assertEquals("Do not throw exception second time",
                applicationService.checkNull(collegeStudent));
        Mockito.verify(applicationDao, Mockito.times(2)).checkNull(collegeStudent);
    }

}
