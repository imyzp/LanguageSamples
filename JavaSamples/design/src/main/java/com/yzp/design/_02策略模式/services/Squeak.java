package com.yzp.design._02策略模式.services;


import com.yzp.design._02策略模式.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我可以吱吱叫");
    }
}
