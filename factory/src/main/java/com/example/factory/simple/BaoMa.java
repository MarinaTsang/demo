package com.example.factory.simple;

import com.example.factory.simple.Car;

public class BaoMa implements Car {
    @Override
    public void getName() {
        System.out.println("宝马");
    }
}
