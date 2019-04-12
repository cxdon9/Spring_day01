package com.baizhi.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {

    //  1.创建properties对象
    static Properties pro = new Properties();

    //  2.编写静态代码块,读取配置文件
    static {
        InputStream inputStream = BeanFactory.class.getResourceAsStream("/a1.properties");
        try {
            pro.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  3.创建一个getObject方法
    public static Object getObject(String key) {
        String value = pro.getProperty(key);
        Class c = null;
        Object o = null;
        try {
            c = Class.forName(value);
            o = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
