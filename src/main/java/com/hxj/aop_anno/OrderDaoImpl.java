package com.hxj.aop_anno;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl {
    public void addOrder() {
        System.out.println("添加订单");
    }

    public void updateOrder() {
        System.out.println("修改订单");
    }
}
