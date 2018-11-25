package com.example.array.thread;

public class Consumer implements Runnable{

//    private MyStorage<FileData> myStorage;
//
//    public Consumer(MyStorage<FileData> myStorage) {
//        this.myStorage = myStorage;
//    }

    private MyStorageWithQueue<FileData> myStorage;


    public Consumer(MyStorageWithQueue<FileData> myStorage) {
        this.myStorage = myStorage;
    }

    @Override
    public void run() {

        for (int i = 0; i < 15; i++) {
            myStorage.consume();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
