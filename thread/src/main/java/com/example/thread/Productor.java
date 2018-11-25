package com.example.array.thread;

public class Productor implements Runnable{

//    private MyStorage<FileData> storage;

//    public Productor(MyStorage<FileData> storage) {
//        this.storage = storage;
//    }

    private MyStorageWithQueue<FileData> storage;

    public Productor(MyStorageWithQueue<FileData> storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            storage.product(new FileData());
            //可以随机生产
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }
}
