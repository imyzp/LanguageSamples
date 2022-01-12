package com.yzp.javasamples1_8.修饰符.final修饰类;

/**
 * @ProjectName javasamples1_8
 * @Description final 修饰的类不能被继承。当子类继承父类时，将可以访问到父类内部数据，并可通过重写父类方法来改变父类方法的实现细节，这可能导致一些不安全的因素。为了保证某个类不可被继承，则可以使用 final 修饰这个类。
 * @Author yaozhenpeng
 * @Time 2021/12/16 23:33
 */
public class FinalClassTest1 {
    final class SuperClass{}


//    class SubClass extends SuperClass{
//
//    }
}
