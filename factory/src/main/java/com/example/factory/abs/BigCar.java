package com.example.factory.abs;

public class BigCar extends AbstractCar {

    @Override
    public void getName() {
        System.out.print("抽象工厂-大车");
    }

//
//    @Override
//   public void getName() {
//        System.out.print("抽象工厂-大车");
//    }
}
