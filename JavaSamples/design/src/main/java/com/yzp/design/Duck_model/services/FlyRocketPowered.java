package com.yzp.design.Duck_model.services;


import com.yzp.design.Duck_model.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用火箭的助我飞行");
    }
}
