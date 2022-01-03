package com.yzp.design.Duck_model.services;


import com.yzp.design.Duck_model.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我有翅膀可以飞行");
    }
}
