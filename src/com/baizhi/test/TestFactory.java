package com.baizhi.test;

import com.baizhi.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person = (Person) cc.getBean("p1");
        System.out.println(person);
    }
}
