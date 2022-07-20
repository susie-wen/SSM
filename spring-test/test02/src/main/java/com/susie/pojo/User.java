package com.susie.pojo;

import java.sql.SQLOutput;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 10:34
 */
public class User {
    private String name;

    public User(){
        System.out.println("user的无参构造");
    }

    public User(String name){
        this.name=name;
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name："+name);
    }
}
