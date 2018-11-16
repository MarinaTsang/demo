package com.example.factory.simple;


import com.example.factory.simple.Audi;
import com.example.factory.simple.BaoMa;
import com.example.factory.simple.Car;

/**
 * 简单工厂模式
 */
public class CarFactory {

    public static final int AUDI_TYPR = 1;
    public static final int BMW_TYPR = 2;

    public static Car creatCar(int type) {
        Car car = null;

        switch (type) {
            case AUDI_TYPR:
                car = new Audi();
                break;
            case BMW_TYPR:
                car = new BaoMa();
                break;
            default:
                throw new RuntimeException("没有这个类型的车");
        }
        return car;
    }


}

