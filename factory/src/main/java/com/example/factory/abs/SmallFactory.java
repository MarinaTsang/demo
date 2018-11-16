package com.example.factory.abs;

public class SmallFactory implements AbstractFactory{
    @Override
    public AbstractCar createCar() {
        return new SmallCar();
    }

    @Override
    public AbstractPlane createPlane() {
        return new SmallPlane();
    }
}
