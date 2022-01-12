package com.yzp.javasamples1_8.修饰符.final修饰引用变量;

import java.util.Arrays;

/**
 * @ProjectName javasamples1_8
 * @Description 引用类型变量
 * final 修饰引用类型变量而言，它保存的仅仅是一个引用，final 只保证这个引用类型变量所引用的地址不会改变，即一直引用同一个对象，但这个对象完全可以发生改变。
 * @Author yaozhenpeng
 * @Time 2021/12/9 23:51
 */
public class FinalRelativeValTest1 {
    public static void main(String[] args) {
        // final修饰数组变量，iArr是一个引用变量
        final int[] iArr = { 5, 6, 12, 9 };
        System.out.println(Arrays.toString(iArr));
        // 对数组元素进行排序，合法
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        // 对数组元素赋值，合法
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));
        // 下面语句对iArr重新赋值,非法
//         iArr = null;
    }

}
