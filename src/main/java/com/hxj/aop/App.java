package com.hxj.aop;

public class App {

    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();
        userDao.addUser();
        userDao.updateUser();

        UserDao userDaoProxy = (UserDao) new ProxyFactory().getProxyInstance(userDao);
        userDaoProxy.addUser();
        userDaoProxy.updateUser();
    }

}
