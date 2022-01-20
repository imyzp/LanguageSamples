package com.yzp.design._2策略模式.services;


import com.yzp.design._2策略模式.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我有翅膀可以飞行");
    }
}
