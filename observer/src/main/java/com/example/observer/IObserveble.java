package com.example.observer;


/**
 * 抽象被观察者，定义注册观察者、添加观察者，删除观察者的接口
 */
public interface IObserveble {

    void registObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver();

}
