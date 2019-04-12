package com.baizhi.test;

import com.baizhi.service.UserService;
import com.baizhi.service.proxy.UserServiceProxy;

public class Test04 {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy();
        userService.save();
    }
}
