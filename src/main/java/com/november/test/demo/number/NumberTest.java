package com.november.test.demo.number;

public class NumberTest {

    //当integer值处于-128--127的时候，调用的Integer.valueOf方法是从cache中已经存在的对象
    //public static Integer valueOf(int i) {
    //        if (i >= IntegerCache.low && i <= IntegerCache.high)
    //            return IntegerCache.cache[i + (-IntegerCache.low)];
    //        return new Integer(i);
    //    }
    //Integer、Short、Byte、Character、Long这几个类的valueOf方法的实现是类似的。
    //
    //　　　　　Double、Float的valueOf方法的实现是类似的。
    public static void main(String args[]){
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1==i2);
        System.out.println(i3==i4);

        Short s1 = 100;
        Short s2 = 100;
        Short s3 = 200;
        Short s4 = 200;

        System.out.println(s1==s2);
        System.out.println(s3==s4);

        Byte b1 = 100;
        Byte b2 = 100;
        Byte b3 = 127;
        Byte b4 = 127;

        System.out.println(b1==b2);
        System.out.println(b3==b4);

//        test1(5);
//        test2(-3);
    }

    private static void test1(int a){
        assert a > 0;
        System.out.println(a);
    }
    private static void test2(int a){
        assert a > 0 : "something goes wrong here, a cannot be less than 0";
        System.out.println(a);
    }

}
