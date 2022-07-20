package com.susie.dao;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 9:02
 */
public class UserDaoMysqlImp implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
