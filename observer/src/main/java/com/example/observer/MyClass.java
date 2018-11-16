package com.example.observer;

/**
 * 观察者模式   测试类
 */

public class MyClass {

    public static void main(String[] agrs){
        //获取被观察者
        MyObserveble myObserveble = new MyObserveble();

        //注册几个
        MyObserver myObserver = new MyObserver();
        MyObserver myObserver1 = new MyObserver();
        Observer2 myObserver2 = new Observer2();

        //建立关联关系
        myObserveble.registObserver(myObserver);
        myObserveble.registObserver(myObserver1);
        myObserveble.registObserver(myObserver2);

        myObserveble.sentMessage("开始更新啦");

        myObserveble.removeObserver(myObserver);

        myObserveble.sentMessage("还有谁在观察");
    }
}
