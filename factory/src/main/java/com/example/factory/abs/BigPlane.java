package com.example.factory.abs;

class BigPlane extends AbstractPlane {
    @Override
    public void getName() {
        System.out.print("抽象工厂-大飞机");
    }
}
