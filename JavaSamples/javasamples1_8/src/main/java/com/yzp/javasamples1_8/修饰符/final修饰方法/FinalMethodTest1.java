package com.yzp.javasamples1_8.修饰符.final修饰方法;

/**
 * @ProjectName javasamples1_8
 * @Description final 修饰的方法不可被重写，如果出于某些原因，不希望子类重写父类的某个方法，则可以使用 final 修饰该方法
 * @Author yaozhenpeng
 * @Time 2021/12/16 23:17
 */
public class FinalMethodTest1 {
    class Sub extends MethodTest {
        // 下面方法定义将出现编译错误，不能重写final方法
//        public void test(){
//
//        }
    }
    class MethodTest {
        public final void test(){}
    }
}
