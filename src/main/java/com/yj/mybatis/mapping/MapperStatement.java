package com.yj.mybatis.mapping;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/24 17:29
 * Copyright 2021 by WiteMedia
 */
public class MapperStatement {

    private String nameSpace;

    private String id;

    private String parameterType;

    private String resultType;

    private String sql;

    public MapperStatement(String nameSpace, String id, String parameterType, String resultType, String sql) {
        this.nameSpace = nameSpace;
        this.id = id;
        this.parameterType = parameterType;
        this.resultType = resultType;
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
