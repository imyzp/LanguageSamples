package com.yzp.design._02策略模式.model;


import com.yzp.design._02策略模式.services.FlyNoWay;
import com.yzp.design._02策略模式.services.Quack;

/**
 * 普通鸭子
 * FlyNoWay
 * Quack
 */
public class ModelDuck extends Duck {

    public ModelDuck()
    {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {

    }
}
