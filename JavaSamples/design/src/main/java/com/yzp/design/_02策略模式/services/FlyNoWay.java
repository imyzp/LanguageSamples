package com.yzp.design._02策略模式.services;


import com.yzp.design._02策略模式.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞行");
    }
}
