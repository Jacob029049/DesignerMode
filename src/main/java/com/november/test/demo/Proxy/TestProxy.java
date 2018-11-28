package com.november.test.demo.Proxy;

public class TestProxy {

    public static void main(String args[]){
//静态代理
//        UserDao userDao = new UserDaoImpl();
//        UserDao userDaoProxy = new UserDaoProxy(userDao);
//        userDaoProxy.save();
        //JDK动态代理
//        UserDao userDao = new UserDaoImpl();
//        UserDao proxy = (UserDao) new ProxyFactory(userDao).getInstance();
//
//        System.out.println(proxy.getClass());
//
//        proxy.save();

        UserDao userDao = new UserDaoImpl();
        UserDaoImpl proxy  = (UserDaoImpl) new ProxyFactoryCglib(userDao).getProxyInstance();
        proxy.save();

    }
}
