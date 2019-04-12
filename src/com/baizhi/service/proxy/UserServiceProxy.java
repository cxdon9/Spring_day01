package com.baizhi.service.proxy;

import com.baizhi.service.UserService;
import com.baizhi.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceProxy implements UserService {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    private UserService userService = (UserServiceImpl) ac.getBean("a3");

    @Override
    public void save() {
        System.out.println("开启事务");
        userService.save();
        System.out.println("关闭事务");
    }
}
