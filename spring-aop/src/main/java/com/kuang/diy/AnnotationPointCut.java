package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/28 21:54
 */

@Aspect  /*使用注解标注为切面，标注此类是一个切面*/
public class AnnotationPointCut {
    @Before("execution(* com.kuang.service.UserServiceImp.*(..))")//找到此类的所有方法
    public void before(){
        System.out.println("====方法执行前===");
    }
    @After("execution(* com.kuang.service.UserServiceImp.*(..))")
    public void after(){
        System.out.println("===方法执行后===");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.kuang.service.UserServiceImp.*(..))")
    public void around(ProceedingJoinPoint jp){
        System.out.println("环绕前");
        Signature signature=jp.getSignature();//获得签名
        System.out.println("signature:"+signature);
        //执行方法
/*        Object proceed=jp.proceed();*/
    }
}
