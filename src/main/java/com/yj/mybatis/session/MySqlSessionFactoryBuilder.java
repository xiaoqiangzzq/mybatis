package com.yj.mybatis.session;

import com.yj.mybatis.mapping.MyConfiguration;
import com.yj.mybatis.parsing.XMLConfigBuilder;

import java.io.FileNotFoundException;
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

        MyConfiguration myConfiguration = null;
        try {
            //读取配置文件xml，和sql dao 文件，转化为java对象
            myConfiguration = XMLConfigBuilder.dealXml(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new MySqlSessionFactory(myConfiguration);
    }




}
