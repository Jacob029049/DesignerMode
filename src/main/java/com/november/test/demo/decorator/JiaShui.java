package com.november.test.demo.decorator;

public class JiaShui implements Cook {
    private Cook cook ;

    public JiaShui(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.cook();
        System.out.println("加水");
    }
}
