package com.example.factory.abs;

public class SmallCar extends AbstractCar{
    @Override
    public void getName() {
        System.out.print("抽象工厂-小车");
    }
}
