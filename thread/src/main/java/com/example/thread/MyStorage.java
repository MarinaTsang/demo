package com.example.array.thread;


import java.util.LinkedList;

/**
 * 仓库类:实现存或取的操作
 * 使用wait 和 notify方式
 */
public class MyStorage<T> {

    int index = 0;  //计数
    //创建缓存区
    private static final int MAX = 20;  //缓存区的大小

    private LinkedList<T> pData = new LinkedList<>();


    /**
     * 生产产品
     *
     * @param p
     */
    public synchronized void product(T p) {
        try {
            while (index > MAX) {
                //缓存区已满，不再生产了
                System.out.println("仓库已满进行等待。。。。");
                this.wait();
                System.out.println("等待结束，继续生产。。。");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("生产。。。。");
        pData.add(p);
        index++;
        //唤醒单个线程
        notify();
        //唤醒多个线程
//        notifyAll();
    }


    public synchronized T consume() {
        try {
            while (index <= 0) {
                //无产品，开始等待
                System.out.println("消费者等待。。。。");
                this.wait();
                System.out.println("继续消费。。。。");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        index--;
        T remove = pData.remove(index);
        System.out.println("消费。。。。"+index);
        notify();
        return remove;

    }


}
