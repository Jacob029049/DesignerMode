package com.november.test.demo.Proxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save.");
    }
}
