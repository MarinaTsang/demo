package com.example.factory.method;

import com.example.factory.simple.BaoMa;
import com.example.factory.simple.Car;

public class BaomaFactoryIml extends FactoryAbstract {
    @Override
    public Car createCar() {

        return new BaoMa();
    }
}
