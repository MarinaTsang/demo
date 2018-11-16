package com.example.factory.method;


import com.example.factory.simple.Car;

/**
 * 工厂方法模式---工厂抽象类，创建实例有工厂实现类操作
 * 好处：可定义不同的工厂，便于扩展不同的产品类型需求
 *
 *
 * 升级为抽象工厂模式 ---产品族等级
 */

public abstract class FactoryAbstract {

    public abstract Car createCar();

//    public abstract Plane createPlane(int type );

}
