package com.yzp.design._02策略模式.test;


import com.yzp.design._02策略模式.model.Duck;
import com.yzp.design._02策略模式.model.MallardDuck;
import com.yzp.design._02策略模式.model.ModelDuck;
import com.yzp.design._02策略模式.services.FlyRocketPowered;

public class TestController {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
