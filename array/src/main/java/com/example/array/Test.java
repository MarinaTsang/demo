package com.example.array;

public class Test {

    public static void main(String[] agrs){

        MyArrayList myArrayList = new MyArrayList();  //默认初始化10

        int size = myArrayList.getSize();

//        System.out.println("长度是："+size); //0

        //添加数据
        myArrayList.add(3);
        myArrayList.add(5);

        System.out.println("长度是："+myArrayList.getSize()); //2

//        display(myArrayList);  //3 5

        //添加固定位置的数据
        myArrayList.addWithIndex(1,15);

//        display(myArrayList); //3 15 5

        //删除数据
        myArrayList.delete(0);

//        display(myArrayList); //5 15

//        System.out.println(myArrayList.getSize());
        myArrayList.deleteWithIndex(1);

//        display(myArrayList);

        myArrayList.find(5,8);
        display(myArrayList);

    }

    private static void display(MyArrayList myArrayList) {
        for (int i = 0; i <myArrayList.getSize(); i++) {
            System.out.println("元素是："+myArrayList.get(i));
        }
    }

}
