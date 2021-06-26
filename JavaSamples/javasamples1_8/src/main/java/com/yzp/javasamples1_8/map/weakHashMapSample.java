package com.yzp.javasamples1_8.map;

import java.util.Map;
import java.util.WeakHashMap;

public class weakHashMapSample {
    public static void main(String[] args) {
        Map weakHashMap = new WeakHashMap();
        for(int i=0;i<3;i++)
        {
            weakHashMap.put("key-"+i,"value-"+i);
        }
        // 输出添加的元素
        System.out.println("数组长度："+weakHashMap.size()+",输出结果："+weakHashMap);

        // 主动触发一次GC
        System.gc();

        // 再次输出添加的元素
        System.out.println("数组长度："+weakHashMap.size()+",输出结果："+weakHashMap);

    }
}
