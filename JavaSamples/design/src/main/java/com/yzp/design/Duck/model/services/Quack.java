package com.yzp.design.Duck.model.services;


import com.yzp.design.Duck.model.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
