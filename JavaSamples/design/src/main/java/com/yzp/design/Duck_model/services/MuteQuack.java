package com.yzp.design.Duck_model.services;


import com.yzp.design.Duck_model.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我只能小声的叫");
    }
}
