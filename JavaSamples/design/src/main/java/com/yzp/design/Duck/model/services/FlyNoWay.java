package com.yzp.design.Duck.model.services;


import com.yzp.design.Duck.model.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
