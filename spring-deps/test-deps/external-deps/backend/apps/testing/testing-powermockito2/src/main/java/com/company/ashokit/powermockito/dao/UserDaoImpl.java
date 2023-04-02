package com.company.ashokit.powermockito.dao;

public class UserDaoImpl implements UserDao{

    @Override
    public String findNameById(int id) {
        System.out.println("findNameById()");
        return "Pushkar";
    }

    @Override
    public String findEmailById(int id) {
        System.out.println("findEmailById()");
        return "pushkarchauhan91@gmail.com";
    }
}
