package com.yzp.design.Duck_model.model;


import com.yzp.design.Duck_model.model.Duck;
import com.yzp.design.Duck_model.services.FlyNoWay;
import com.yzp.design.Duck_model.services.Quack;

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
