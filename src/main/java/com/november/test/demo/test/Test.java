package com.november.test.demo.test;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]){
//        final long quantity ;
//        quantity =returnQuantity();
//        System.out.println(quantity);

        List<String> list= new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("8");
        for ( String s :list){
            if (!s.equals("4")){
                System.out.println(s+"...");
            }else {
//                StringUtils.delete(s);
            }
        }

    }

    public static long returnQuantity(){
        return 3l;
    }
}
