package com.yzp.design._02策略模式.services;


import com.yzp.design._02策略模式.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我可以呱呱叫");
    }
}
