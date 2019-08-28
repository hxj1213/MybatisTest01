package com.hxj.aop;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void updateUser() {
        System.out.println("修改用户");
    }
}
