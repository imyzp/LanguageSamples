package com.yzp.design.Duck.model;


import com.yzp.design.Duck.model.services.FlyNoWay;
import com.yzp.design.Duck.model.services.Quack;

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
