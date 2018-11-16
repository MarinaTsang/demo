package com.example.factory;

import com.example.factory.abs.AbstractCar;
import com.example.factory.abs.AbstractPlane;
import com.example.factory.abs.BigFactory;
import com.example.factory.abs.SmallFactory;
import com.example.factory.method.AudiFactoryIml;
import com.example.factory.method.BaomaFactoryIml;
import com.example.factory.simple.Audi;
import com.example.factory.simple.Car;
import com.example.factory.simple.CarFactory;

public class MyClass {

    public static void main(String[] agrs){

        //简单工厂模式
        Audi audi = (Audi) CarFactory.creatCar(CarFactory.AUDI_TYPR);
        audi.getName();

        //工厂方法模式
        AudiFactoryIml audiFactoryIml = new AudiFactoryIml();
        Car car = audiFactoryIml.createCar();
        car.getName();
        BaomaFactoryIml baomaFactoryIml = new BaomaFactoryIml();
        Car car1 = baomaFactoryIml.createCar();
        car1.getName();


        //抽象工厂模式--系统一次只能消耗其中一族产品
        BigFactory factory = new BigFactory();
        AbstractCar car2 = factory.createCar();
        AbstractPlane plane = factory.createPlane();
        car2.getName();
        plane.getName();


    }

}
