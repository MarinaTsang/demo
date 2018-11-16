package com.example.observer;

public class Observer2 implements IObserver {
    @Override
    public void update(String message) {
        //接收到消息后取消注册
        System.out.println("接收到消息2");
    }
}
