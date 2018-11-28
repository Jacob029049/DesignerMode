package com.november.test.demo.decorator;

public class JiaMi implements Cook {

    private Cook cook ;
    public JiaMi(Cook cook){
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.cook();
        System.out.println("加米");
    }
}
