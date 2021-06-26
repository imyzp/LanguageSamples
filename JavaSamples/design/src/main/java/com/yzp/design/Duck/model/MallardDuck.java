package com.yzp.design.Duck.model;


import com.yzp.design.Duck.model.services.FlyWithWings;
import com.yzp.design.Duck.model.services.Quack;

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
