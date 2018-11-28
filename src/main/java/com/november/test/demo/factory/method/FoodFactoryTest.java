package com.november.test.demo.factory.method;

public class FoodFactoryTest {

    //工厂模式
    //发及时信息，则只需做一个实现类，实现Food接口，
    // 同时做一个工厂类，实现Provider接口，
    // 无需去改动现成的代码。这样做，拓展性较好！
    public static void main(String args[]){
        //1
        FoodFactory foodFactory = new FoodFactory();
        Food food1 = foodFactory.produce("milk");
        food1.Drink();
        //2
        Food food2 = foodFactory.produceWater();
        food2.Drink();
        //3
        Food food3 = FoodFactory.produceMilk();
        food3.Drink();
        //4
        Provider provider1 = new DProvider();
        Food food4 = provider1.produce();
        food4.Drink();
        //5
        Provider provider2 = new EProvider();
        Food food5 =provider2.produce();
        food5.Drink();
        //6
        Provider provider3 = new FProvider();
        Food food6 =provider3.produce();
        food6.Drink();
    }
}
