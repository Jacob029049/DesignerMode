package com.november.test.demo.factory.method;

public class EProvider implements Provider {
    @Override
    public Food produce() {
        return new E();
    }
}
