package com.november.test.demo.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void exec(){
        command.exec();
    }
}
