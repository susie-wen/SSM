package com.kuang.diy;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/28 21:37
 */
public class DiyPointCut {
    public void before(){
        System.out.println("====方法执行前===");
    }
    public void after(){
        System.out.println("===方法执行后===");
    }
}
