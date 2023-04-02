package com.company.junitdemo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;
import java.util.List;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    private DemoUtils demoUtils;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll() called ...");
    }

    @BeforeEach
    void setUp() {
        demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Equals and Not Equals")
    @Order(1)
    void test_Equals_And_Not_Equals() {
        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        Assertions.assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");
    }

    @Test
    @DisplayName("Null and Not Null")
    @Order(0)
    void test_Null_And_Not_Null() {
        String s1 = null;
        String s2 = "pushkar";
        Assertions.assertNull(demoUtils.checkNull(s1), "Object should be null");
        Assertions.assertNotNull(demoUtils.checkNull(s2), "Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame() {
        String str = "pushkar";
        Assertions.assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object");
        Assertions.assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to same object");
    }

    @Test
    @DisplayName("True and False")
    @Order(30)
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;
        Assertions.assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        Assertions.assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @Test
    @DisplayName("Array Equals")
    void testArrayEquals() {
        String[] arr1 = {"A", "B", "C"};
        Assertions.assertArrayEquals(arr1, demoUtils.getFirstThreeLettersOfAlphabet(), "Array should be same");
    }

    @Test
    @DisplayName("Iterable Equals")
    void testIterableEquals() {
        List<String> list = List.of("luv", "2", "code");
        Assertions.assertIterableEquals(list, demoUtils.getAcademyInList(), "Expected list should be same");
    }

    @Test
    @DisplayName("Lines Match")
    @Order(50)
    void testLinesMatch() {
        List<String> list = List.of("luv", "2", "code");
        Assertions.assertLinesMatch(list, demoUtils.getAcademyInList(), "Lines should match");
    }

    @Test
    @DisplayName("Throws and Does Not Throws")
    void testThrowsAndDoesNotThrows() {
        Assertions.assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
        }, "Should throw an Exception");
        Assertions.assertDoesNotThrow(() -> {
            demoUtils.throwException(1);
        }, "Should throw an Exception");
    }

    @Test
    @DisplayName("Timeout")
    void testTimeout() {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            demoUtils.checkTimeout();
        }, "Method should execute in 3 seconds");
    }

    @Test
    @DisplayName("Multiply")
    void testMultiply() {
        Assertions.assertEquals(12, demoUtils.multiply(3, 4), "3*4 must be 12");
    }

    @Test
    @Disabled("Don't run this test until JIRA-1000 is resolved")
    void testConditional() {

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS, OS.LINUX})
    void testForMacWindowsLinuxOnly() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForJava17() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testForJava11() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)
    void testForJavaRange() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForJavaRangeMin() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    void testOnlyForDevEnvironment() {

    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYSTEM_PROPERTY", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {

    }

    @AfterEach
    void tearDown() {
        demoUtils = null;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll() called ...");
    }

}
