package com.november.test.demo.decorator;

//好处：可以让我们对之前的类进行很好的扩展。比起继承类的方式，
// 装饰器模式对功能的扩展是很动态的。可以添加撤销，因为你还可以添加判断条件。
// 你还可以编写很多各种各样的装饰类，以各样的顺序和次数进行装饰。
//
//  不好的地方：装饰类多了，功能相似，出了问题的时候，排错花的时间就长了。
public class client {

    public static void main(String args[]){
        Cook cook = new DianHuo(new JiaShui(new JiaMi(new StartCook())));
        cook.cook();

    }
}
