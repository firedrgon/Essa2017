package com.javaBasic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yuanping on 2018/1/7.
 */
public class MethodInvokeTest {
    public static void main(String[] args) throws Exception {
        String str = "hello";
        Method method = str.getClass().getMethod("toUpperCase");
        Object result = method.invoke(str);
        System.out.println(result);
    }
}
