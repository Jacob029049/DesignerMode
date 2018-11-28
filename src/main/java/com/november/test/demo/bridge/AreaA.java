package com.november.test.demo.bridge;

public abstract class AreaA {
    private Qiao qiao;

    public void setQiao(Qiao qiao) {
        this.qiao = qiao;
    }
    abstract void  areaFrom();
}
