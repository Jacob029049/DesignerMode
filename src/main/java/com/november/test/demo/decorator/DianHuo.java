package com.november.test.demo.decorator;

public class DianHuo implements Cook {

    private Cook cook ;


    public DianHuo(Cook cook){
        this.cook = cook;
    }
    @Override
    public void cook() {
        cook.cook();
        System.out.println("点火");
    }
}
