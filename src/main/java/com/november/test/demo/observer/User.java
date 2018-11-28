package com.november.test.demo.observer;

public class User implements Observer {
    private String name;
    private String message;

    public User(String name){
        this.name=name;
    }

    @Override
    public void updateMessage(String message) {
        this.message = message;
        System.out.println(name+"::"+message);
    }
}
