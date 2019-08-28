package com.hxj.service.impl;

import com.hxj.dao.UserDao;
import com.hxj.dao.impl.UserDaoImpl;
import com.hxj.model.User;
import com.hxj.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
