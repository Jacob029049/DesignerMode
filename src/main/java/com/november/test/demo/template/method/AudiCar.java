package com.november.test.demo.template.method;

public class AudiCar extends Car {
    @Override
    public void start() {
        System.out.println("AudiCar start.");
    }

    @Override
    public void stop() {
        System.out.println("AudiCar stop.");
    }
}
