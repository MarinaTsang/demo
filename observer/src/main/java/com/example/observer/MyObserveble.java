package com.example.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */

public class MyObserveble implements IObserveble{

    private String message ;  //需要传递的信息

//存放添加的观察者
    private List<IObserver>  observerList;

    public MyObserveble(){
        observerList = new ArrayList<>();
    }


    @Override
    public void registObserver(IObserver observer) {
        if (observerList!=null){
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observerList!=null && observerList.size()>0){
            observerList.remove(observer);
        }

    }

    @Override
    public void notifyObserver() {
        //循环通知每个观察者
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(message);
        }

    }

    public void sentMessage(String message){
        this.message = message;
        System.out.println("发送消息。。。。");
        notifyObserver();
    }

}
