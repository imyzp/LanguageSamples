package com.yzp.javasamples1_8.gc;

import java.lang.ref.SoftReference;

public class gc {
    public static void main(String[] args) {
        // 软引用测试
        testSoftReference();
    }

    /**
     * 软引用缓存的应用场景
     */
    private static void testSoftReference() {
        String cache = new String("abc");

        // 放入软引用
        SoftReference<String> stringSoftReference = new SoftReference<>(cache);

        // 判断是否被GC回收
        if(stringSoftReference.get() != null){
            // 还未回收，直接获取
            cache = stringSoftReference.get();
        }else{
            // 由于内存不够时，导致GC回收了软引用
            // 重新创建对象
            cache = new String("abc");
            // 放入软引用
            SoftReference<String> strSoftReference = new SoftReference<>(cache);

        }
    }
}
