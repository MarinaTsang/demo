package com.example.array.thread;

import java.util.concurrent.LinkedBlockingDeque;

public class MyStorageWithQueue<T> {

    //置了具有阻塞作用
    private LinkedBlockingDeque<T> tLinkedBlockingDeque = new LinkedBlockingDeque<>();

    public void product(T t){
        try {
            tLinkedBlockingDeque.put(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("生产。。。。");
    }

    public T consume(){
        T take = null;
        try {
            take = tLinkedBlockingDeque.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("消费。。。。");
        return take;
    }


}
