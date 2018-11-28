package com.november.test.demo.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target ;

    public ProxyFactory(Object target){
        this.target= target;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始1");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交2");
                        return returnValue;
                    }
                });
    }
}
