package com.yj.mybatis.session;

import com.yj.mybatis.mapping.MyConfiguration;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/24 16:58
 * Copyright 2021 by WiteMedia
 */
public class MySqlSessionFactory {

    private MyConfiguration myConfiguration;

    public MySqlSessionFactory(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }


}
