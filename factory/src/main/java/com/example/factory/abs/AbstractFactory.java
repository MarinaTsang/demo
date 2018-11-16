package com.example.factory.abs;

/**
 * 抽象工厂模式--抽象工厂方法
 * 
 */
public interface AbstractFactory {

    AbstractCar createCar();
    AbstractPlane createPlane();

}
