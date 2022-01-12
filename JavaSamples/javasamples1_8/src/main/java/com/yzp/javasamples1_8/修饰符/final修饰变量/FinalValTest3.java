package com.yzp.javasamples1_8.修饰符.final修饰变量;

/**
 * @ProjectName javasamples1_8
 * @Description  基本类型变量
 * final 修饰的成员变量在声明时没有赋值的叫“空白 final 变量”。空白 final 变量必须在构造方法或静态代码块中初始化。
 * @Author yaozhenpeng
 * @Time 2021/12/9 23:42
 */
public class FinalValTest3 {
    final int a = 5;// 直接赋值
    final int b;// 空白final变量

    public FinalValTest3() {
        this.b = 5;
//        this.b = 6;// 报错
    }
}
