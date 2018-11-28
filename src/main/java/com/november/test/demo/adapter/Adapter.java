package com.november.test.demo.adapter;

//继承EarphoneImpl 的话代表的是类适配器模式，目前 对象适配器模式
//把充电口转化成耳机口
public class Adapter implements ChargePort {

    private Earphone earphone;

    public  Adapter(Earphone earphone){
        this.earphone=earphone;
    }

    @Override
    public void isChargePort() {
        earphone.isEarphone();
    }
}
