package com.example.decorator;

/**
 * 被装饰者和装饰者的父类
 */
public abstract class Component {

    String desc = "游戏装备";

    public String getDesc() {
        return desc;
    }

    public abstract int getPrice();

}

