package com.yzp.design.Duck_model.model;


import com.yzp.design.Duck_model.model.Duck;
import com.yzp.design.Duck_model.services.FlyWithWings;
import com.yzp.design.Duck_model.services.Quack;

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
