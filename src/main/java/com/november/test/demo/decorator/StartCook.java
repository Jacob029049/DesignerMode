package com.november.test.demo.decorator;

public class StartCook implements Cook {

    @Override
    public void cook() {
        System.out.println("开始煮饭:");
    }
}
