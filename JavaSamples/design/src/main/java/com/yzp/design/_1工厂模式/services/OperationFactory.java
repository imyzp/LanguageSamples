package com.yzp.design._1工厂模式.services;

import com.yzp.design._1工厂模式.model.Operation;
import com.yzp.design._1工厂模式.model.Operation1;
import com.yzp.design._1工厂模式.model.Operation2;
import com.yzp.design._1工厂模式.model.Operation3;

/**
 * @ProjectName LanguageSamples
 * @Description 工厂
 * @Author yaozhenpeng
 * @Time 2022/1/12 23:25
 */
public class OperationFactory {
    public static Operation createOperation(int type){
        Operation operation = null;
        switch (type)
        {
            case 1:
                operation = new Operation1();
                break;
            case 2:
                operation = new Operation2();
                break;
            case 3:
                operation = new Operation3();
                break;
            default:
                break;
        }
        return operation;
    }
}
