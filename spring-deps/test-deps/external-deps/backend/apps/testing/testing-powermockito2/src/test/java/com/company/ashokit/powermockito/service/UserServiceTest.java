package com.company.ashokit.powermockito.service;

import com.company.ashokit.powermockito.dao.UserDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;

class UserServiceTest {

    @Test
    void testGetNameByUserId() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(userDao.findNameById(101)).thenReturn("Pushkar");
        PowerMockito.when(userDao.findNameById(102)).thenReturn("Vivek");
        UserService userService = new UserService(userDao);
        String actual = userService.getNameByUserId(101);
        Assertions.assertEquals("Pushkar", actual);
    }

    @Test
    void testGetEmailByUserId() {
        UserDao userDao = PowerMockito.mock(UserDao.class);
        PowerMockito.when(userDao.findEmailById(101)).thenReturn("pushkarchauhan91@gmail.com");
        UserService userService = new UserService(userDao);
        String actual = userService.getEmailByUserId(101);
        Assertions.assertEquals("pushkarchauhan91@gmail.com", actual);
    }

    @Test
    void testDoProcessMethodWhichReturnVoid() {
        UserService userService = PowerMockito.mock(UserService.class);
        try {
            PowerMockito.doNothing().when(userService, "pushMessagesToKafkaTopic", ArgumentMatchers.anyString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Use Spy for Private Method Mocking
    @Test
    @Disabled
    void testDoWorkWithPrivateMethodMock() throws Exception {
        UserService userService = new UserService();
        UserService spy = PowerMockito.spy(userService);
        PowerMockito.when(spy, "formatMessage", "test message").thenReturn("TEST MESSAGE");
        String formattedMessage = userService.doWork("test message");
        Assertions.assertEquals("TEST MESSAGE", formattedMessage);
    }
}