package com.november.test.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverableImpl implements Observerable {

    private List<Observer> observerList;
    private String message;

    public ObserverableImpl(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerUser(Observer o) {
        observerList.add(o);
    }

    @Override
    public void deleteUser(Observer o) {
        if (!observerList.isEmpty()) {
            observerList.remove(o);
        }
    }

    @Override
    public void notifyUser() {
        for (Observer o: observerList){
            o.updateMessage(message);
        }
    }

    public void setInformation(String s){
        this.message=s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyUser();
    }
}
