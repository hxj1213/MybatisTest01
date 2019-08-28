package com.hxj.dao.impl;

import com.hxj.dao.UserDao;
import com.hxj.model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) {
        System.out.println("添加"+user+"成功");
    }
}
