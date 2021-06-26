package com.yzp.design.Duck.model.services;


import com.yzp.design.Duck.model.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
