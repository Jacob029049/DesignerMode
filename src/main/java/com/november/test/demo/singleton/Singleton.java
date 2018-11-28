package com.november.test.demo.singleton;

public class Singleton {
    int b =2;
    private void Singleton(){};

    private static class SingletonBuild{
        private static Singleton value = new Singleton();
    }
    public static Singleton getInstance(){  return  SingletonBuild.value ;}

}
