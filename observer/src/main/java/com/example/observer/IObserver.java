package com.example.observer;

/**
 * 抽象观察者，在接收到观察者的消息时做出更新
 */

public interface IObserver {

    void update(String message);  //接收到的消息
}
