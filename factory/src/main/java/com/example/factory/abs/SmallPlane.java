package com.example.factory.abs;

public class SmallPlane extends AbstractPlane{
    @Override
    public void getName() {
        System.out.print("抽象工厂-小飞机");

    }
}
