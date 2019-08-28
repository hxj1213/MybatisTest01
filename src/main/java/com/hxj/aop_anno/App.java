package com.hxj.aop_anno;

import com.hxj.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-aop.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl");
        userDao.addUser();
        userDao.updateUser();
        //class com.sun.proxy.$Proxy15
        System.out.println(userDao.getClass());

        OrderDaoImpl orderDao = (OrderDaoImpl) applicationContext.getBean("orderDaoImpl");
        orderDao.addOrder();
        orderDao.updateOrder();
        System.out.println(orderDao.getClass());
    }

}
