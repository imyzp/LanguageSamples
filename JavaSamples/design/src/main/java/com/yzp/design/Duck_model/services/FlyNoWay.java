package com.yzp.design.Duck_model.services;


import com.yzp.design.Duck_model.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞行");
    }
}
