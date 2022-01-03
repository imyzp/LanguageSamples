package com.yzp.design.Duck_model.services;


import com.yzp.design.Duck_model.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我可以吱吱叫");
    }
}
