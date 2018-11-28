package com.november.test.demo.template.method;

//
//一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
  //      各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
// 这是Opdyke和Johnson所描述过的“重分解以一般化”的一个很好的例子。
// 首先识别现有代码中的不同之处，并且将不同之处分离为新的操作。
// 最后，用一个调用这些新的操作的模板方法来替换这些不同的代码。

public class Client {

    public static void main(String args[]){
        Car wcar = new Wcar();
        wcar.exect();
    }
}
