package com.hxj.aop;

public class Aop {

    public void before(){
        System.out.println("开始事务");
    }

    public void after(){
        System.out.println("结束事务");
    }

}
