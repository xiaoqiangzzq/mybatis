package com.yj.mybatis.session;

import com.yj.mybatis.mapping.MyConfiguration;

import java.io.InputStream;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/24 17:00
 * Copyright 2021 by WiteMedia
 */
public class MySqlSessionFactoryBuilder {

    public MySqlSessionFactory build(InputStream inputStream){

        MyConfiguration myConfiguration = new MyConfiguration();
        return new MySqlSessionFactory(myConfiguration);
    }
}
