package com.hxj.test;

import com.hxj.model.User;
import com.hxj.service.UserService;
import com.hxj.service.impl.UserServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App01 {

    @Test
    public void test(){
        UserService userService = new UserServiceImpl();
        userService.addUser(new User());
    }

    @Test
    public void testIOC01(){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        Object user = context.getBean("user");
        System.out.println(user);

        user = context.getBean("user");
        System.out.println(user);
    }

}
