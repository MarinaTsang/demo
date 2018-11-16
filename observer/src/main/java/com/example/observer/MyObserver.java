package com.example.observer;

/**
 * 具体观察者
 */

public class MyObserver implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("观察者接收到消息。。。。"+message);
    }
}
