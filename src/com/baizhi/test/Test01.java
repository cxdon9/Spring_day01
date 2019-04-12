package com.baizhi.test;

import com.baizhi.service.UserService;
import com.baizhi.service.impl.UserServiceImpl;

public class Test01 {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.save();
    }
}
