package com.example.array.thread;


/**
 * 生产者和消费者模型
 */
public class ProductAndResume {

    public static void main(String[] agrs){

//        MyStorage<FileData> myStorage = new MyStorage<>();

//        Productor p  = new Productor(myStorage);
        //启动线程生产
//        new Thread(new Productor(myStorage)).start();
//        new Thread(new Consumer(myStorage)).start();

        //第二种方式
        MyStorageWithQueue<FileData> fileDataMyStorageWithQueue = new MyStorageWithQueue<>();
        new Thread(new Productor(fileDataMyStorageWithQueue)).start();
        new Thread(new Consumer(fileDataMyStorageWithQueue)).start();
    }

}
