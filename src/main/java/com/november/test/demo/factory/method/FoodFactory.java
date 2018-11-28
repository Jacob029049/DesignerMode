package com.november.test.demo.factory.method;

public class FoodFactory {

    public Food produce(String type) {
        if ("milk".equals(type)) {
            return new B();
        } else if ("water".equals(type)) {
            return new A();
        }else if ("orangeJuice".equals(type)) {
            return new C();
        }  else {
            System.out.println("请输入正确的类型!");
            return null;
        }

    }

    public static Food produceMilk(){
        return new B();
    }

    public Food produceWater(){
        return new A();
    }
}
