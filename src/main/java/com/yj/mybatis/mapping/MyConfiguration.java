package com.yj.mybatis.mapping;

import com.yj.mybatis.session.MySqlSessionFactory;
import org.omg.CORBA.Environment;

import java.util.Map;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/24 17:05
 * Copyright 2021 by WiteMedia
 */
public class MyConfiguration {

    //mybatis-config.xml

    private MyEnvironment myEnvironment;

    //xxMapper.xml
    private Map<String,MapperStatement> mapperStatementMap;

    public MyConfiguration(MyEnvironment myEnvironment, Map<String, MapperStatement> mapperStatementMap) {
        this.myEnvironment = myEnvironment;
        this.mapperStatementMap = mapperStatementMap;
    }

    public MyEnvironment getMyEnvironment() {
        return myEnvironment;
    }

    public void setMyEnvironment(MyEnvironment myEnvironment) {
        this.myEnvironment = myEnvironment;
    }

    public Map<String, MapperStatement> getMapperStatementMap() {
        return mapperStatementMap;
    }

    public void setMapperStatementMap(Map<String, MapperStatement> mapperStatementMap) {
        this.mapperStatementMap = mapperStatementMap;
    }
}
