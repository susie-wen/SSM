package com.susie.service;

import com.susie.dao.UserDao;
import com.susie.dao.UserDaoImp;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 8:56
 */
public class UserServiceImp implements UserService{
    private UserDao userDao=new UserDaoImp();
    @Override
    public void getUser() {
        userDao.getUser();
    }

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
}
