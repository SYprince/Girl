package com.wangzi.girl.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: prince
 * @Date: Created in 10:40 2017/11/28
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DefineAnnotation {
    String value() default "false";
}