package com.yzp.javasamples1_8.util;

import java.util.UUID;

public class UUIDUtil {
    public static String getUUIDFromBytes(String... str){
        String s = "";
        String[] clone = str.clone();

        for(String a: clone)
        {
            if(a != null)
            {
                s+=a;
            }
        }
        String code = UUID.nameUUIDFromBytes(s.getBytes()).toString().replaceAll("-","");
        return code;
    }
}
