package com.yzp.design._2策略模式.model;


import com.yzp.design._2策略模式.services.FlyWithWings;
import com.yzp.design._2策略模式.services.Quack;

/**
 * 绿头鸭
 * FlyWithWings
 * Quack
 */
public class MallardDuck extends Duck {

    public MallardDuck()
    {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
