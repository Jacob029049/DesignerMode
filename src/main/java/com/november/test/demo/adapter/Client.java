package com.november.test.demo.adapter;

//类适配器与对象适配器的使用场景一致，仅仅是实现手段稍有区别，二者主要用于如下场景：
//
//　　（1）想要使用一个已经存在的类，但是它却不符合现有的接口规范，导致无法直接去访问，
//      这时创建一个适配器就能间接去访问这个类中的方法。
//
//　　（2）我们有一个类，想将其设计为可重用的类（可被多处访问），
//          我们可以创建适配器来将这个类来适配其他没有提供合适接口的类。
//
//　　以上两个场景其实就是从两个角度来描述一类问题，那就是要访问的方法不在合适的接口里，
//      一个从接口出发（被访问），一个从访问出发（主动访问）。
//
//接口适配器使用场景：
//
//　　（1）想要使用接口中的某个或某些方法，但是接口中有太多方法，
//  我们要使用时必须实现接口并实现其中的所有方法，可以使用抽象类来实现接口，并不对方法进行实现（仅置空），然后我们再继承这个抽象类来通过重写想用的方法的方式来实现。这个抽象类就是适配器。

//限定条件：在只能访问这一个特定接口，且接口方法不满足实现的时候 用适配器模式，
public class Client {

    public static void main(String args[]){
        ChargePort chargePort = new Adapter(new EarphoneImpl());
        chargePort.isChargePort();

        A a= new BImpl();
        a.A();
        a.B();
    }
}
