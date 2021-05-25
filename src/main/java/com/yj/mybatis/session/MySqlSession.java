package com.yj.mybatis.session;

import com.yj.mybatis.executor.MyExecutor;
import com.yj.mybatis.mapping.MyConfiguration;
import com.yj.mybatis.proxy.MapperProxy;

import java.lang.reflect.Proxy;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/25 16:43
 * Copyright 2021 by WiteMedia
 */
public class MySqlSession {

    private MyConfiguration myConfiguration;

    private MyExecutor myExecutor;

    public MySqlSession(MyConfiguration myConfiguration, MyExecutor myExecutor) {
        this.myConfiguration = myConfiguration;
        this.myExecutor = myExecutor;
    }

    public <T> T getMapper(Class<T> clazz){

        MapperProxy mapperProxy = new MapperProxy();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),new Class<?>[] {clazz},mapperProxy);

    }
}
