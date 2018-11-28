package com.november.test.demo.template.method;

public class Wcar extends Car {
    @Override
    public void start() {
        System.out.println("Ocar start.");
    }

    @Override
    public void stop() {
        System.out.println("Ocar stop.");
    }
}
