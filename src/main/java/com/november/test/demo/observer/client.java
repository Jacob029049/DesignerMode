package com.november.test.demo.observer;

public class client {
    public static void main(String args[]){
        Observer user1 = new User("user1");
        Observer user2 = new User("user2");
        Observer user3 = new User("user3");

        Observerable server = new ObserverableImpl();
        server.registerUser(user1);
        server.registerUser(user2);
        server.registerUser(user3);

        ((ObserverableImpl) server).setInformation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.deleteUser(user3);
        ((ObserverableImpl) server).setInformation("JAVA是世界上最好用的语言！");

    }
}
