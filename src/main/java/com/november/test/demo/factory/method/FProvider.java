package com.november.test.demo.factory.method;

public class FProvider implements Provider {
    @Override
    public Food produce() {
        return new F();
    }
}
