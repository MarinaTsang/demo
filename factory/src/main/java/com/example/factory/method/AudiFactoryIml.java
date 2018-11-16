package com.example.factory.method;


import com.example.factory.simple.Audi;
import com.example.factory.simple.Car;

/**
 * 工厂方法模式的子类工厂
 */

public class AudiFactoryIml extends FactoryAbstract {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
