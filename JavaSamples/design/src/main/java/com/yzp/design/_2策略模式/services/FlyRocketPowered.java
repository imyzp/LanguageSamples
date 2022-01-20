package com.yzp.design._2策略模式.services;


import com.yzp.design._2策略模式.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用火箭的助我飞行");
    }
}
