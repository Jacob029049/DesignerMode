package com.november.test.demo.bridge;

public class TestClient {

    //JDBC数据库访问接口API正是经典的桥接模式的实现者
    public  static void main(String args[]){
        AreaA2 areaA2 = new AreaA2();
        Qiao qiao = new AreaB2();
        areaA2.setQiao(qiao);
        areaA2.areaFrom();
        qiao.AreaB();

    }
}
