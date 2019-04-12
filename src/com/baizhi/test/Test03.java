package com.baizhi.test;

import com.baizhi.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user1 = (User) ac.getBean("a5");
        User user2 = (User) ac.getBean("a6");
        System.out.println(user1);
        System.out.println(user2);
    }
}
