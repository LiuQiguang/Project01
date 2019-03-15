package com.lqg.java;

/**
 * @author LQG
 * @date 2019/3/14 - 21:15
 */
public class Hello {

    public static void main(String[] args) {
        String[] names=new String[]{"Tom","Jerry","HanMeiMei","LiLei"};

        //fori
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //iter
        for (String name : names) {
            System.out.println(name);
        }

        //itar
        for (int i = 0; i < names.length; i++) {
            String  name = names[i];
            System.out.println(name);
        }
    }
}
