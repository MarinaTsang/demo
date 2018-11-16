package com.example.factory.abs;


/**
 * 一族产品的一部分工厂类
 */
public class BigFactory implements AbstractFactory{
    @Override
    public AbstractCar createCar() {
        return new BigCar();
    }

    @Override
    public AbstractPlane createPlane() {
        return new BigPlane();
    }
}
