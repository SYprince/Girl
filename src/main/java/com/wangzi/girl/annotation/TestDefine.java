package com.wangzi.girl.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: prince
 * @Date: Created in 13:46 2017/11/28
 */

/**
 * .getclass()
 * .class
 *
 */
public class TestDefine {

    void test0(TestDefine testDefine) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        TestDefine obj = TestDefine.class.getConstructor(new Class[]{}).newInstance(new Object());
        for (Method method : TestDefine.class.getDeclaredMethods()) {
            DefineAnnotation defineAnnotation = method.getAnnotation(DefineAnnotation.class);
        }
    }
    @DefineAnnotation(value = "true")
    void test1(){

    }
}
