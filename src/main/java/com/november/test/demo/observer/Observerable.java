package com.november.test.demo.observer;

public interface Observerable {
    void registerUser(Observer o);
    void deleteUser(Observer o);
    void notifyUser();
}
