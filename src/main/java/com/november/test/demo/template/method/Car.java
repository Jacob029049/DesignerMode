package com.november.test.demo.template.method;

public abstract class Car {
    public abstract void start();
    public abstract void stop();

    public void exect(){
        start();
        stop();
    }
}
