package com.november.test.demo.factory.method;

public class DProvider implements Provider {
    @Override
    public Food produce() {
        return new D();
    }
}
