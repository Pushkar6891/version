package com.company.ashokit.powermockito.service;

import com.company.ashokit.powermockito.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public UserService() {
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getNameByUserId(int id) {
        String name = userDao.findNameById(id);
        return name;
    }

    public String getEmailByUserId(int id) {
        String email = userDao.findEmailById(id);
        return email;
    }

    public void doProcess() {
        System.out.println("doProcess() start");
        pushMessagesToKafkaTopic("message");
        System.out.println("doProcess() end");
    }

    public void pushMessagesToKafkaTopic(String message) {
        System.out.println("Message pushing to kafka....." + message);
    }

    public String doWork(String message) {
        String formattedMessage = formatMessage(message);
        return formattedMessage;
    }

    private String formatMessage(String message) {
        return message.toUpperCase();
    }

}
