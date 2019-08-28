package com.hxj.aop_anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
指定一个类为切面类
 */
@Component
@Aspect
public class Aop {

    @Pointcut("execution(* com.hxj.aop_anno.*Impl.*(..))")
    public void point_cut(){

    }

    @Before("point_cut()")
    public void before(){
        System.out.println("开始事务");
    }

    @After("point_cut()")
    public void after(){
        System.out.println("结束事务");
    }

}
