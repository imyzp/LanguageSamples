package com.yzp.javasamples1_8.修饰符.final修饰变量;

/**
 * @ProjectName javasamples1_8
 * @Description 基本类型变量
 * final 修饰的局部变量必须使用之前被赋值一次才能使用。
 *
 * @Author yaozhenpeng
 * @Time 2021/12/9 23:38
 */
public class FinalValTest2 {
    public void doSomething(){
        final int e;
        // 只能赋值一次
        e = 100;
        System.out.println(e);

    }
}
