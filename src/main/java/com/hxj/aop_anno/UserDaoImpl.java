package com.hxj.aop_anno;

import org.springframework.stereotype.Repository;

@Repository
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
