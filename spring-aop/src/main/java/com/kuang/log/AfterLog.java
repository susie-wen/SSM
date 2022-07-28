package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/28 20:58
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为："+returnValue);
    }
}
