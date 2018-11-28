package com.november.test.demo.Proxy;

//静态代理
public class UserDaoProxy implements UserDao {

    private UserDao userDao;

    public UserDaoProxy(UserDao userDao){
        this.userDao =userDao;
    }
    @Override
    public void save() {
        System.out.println("11111");
        userDao.save();
        System.out.println("22222");
    }
}
