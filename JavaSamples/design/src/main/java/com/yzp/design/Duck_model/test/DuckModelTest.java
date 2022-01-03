package com.yzp.design.Duck_model.test;


import com.yzp.design.Duck_model.model.Duck;
import com.yzp.design.Duck_model.model.MallardDuck;
import com.yzp.design.Duck_model.model.ModelDuck;
import com.yzp.design.Duck_model.services.FlyRocketPowered;

public class DuckModelTest {
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
