package com.yzp.design.Duck.model.services;


import com.yzp.design.Duck.model.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
