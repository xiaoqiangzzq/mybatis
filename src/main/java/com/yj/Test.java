package com.yj;

import com.yj.mybatis.session.MySqlSessionFactory;
import com.yj.mybatis.session.MySqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/24 16:34
 * Copyright 2021 by WiteMedia
 */
public class Test {

    public static void main(String[] args) {
        //1.读取mybatis-config文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
//        2.构建sqlsessionFactory
        MySqlSessionFactory build = new MySqlSessionFactoryBuilder().build(inputStream);
//        3.打开sqlsession
//        4.获取mapper接口对象
//        5.调用mapper接口对象的方法操作数据库


    }
}
