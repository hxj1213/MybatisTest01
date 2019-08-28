package com.hxj.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    Aop aop = new Aop();

    public Object getProxyInstance(final Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aop.before();
                        Object returnResult = method.invoke(target,args);
                        aop.after();
                        return returnResult;
                    }
                }
        );
    }

}
