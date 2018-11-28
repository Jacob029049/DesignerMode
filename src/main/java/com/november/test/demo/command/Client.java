package com.november.test.demo.command;

public class Client {

    public static void main(String args[]){
        Receiver receiver =new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.exec();
    }
}
