package com.yj.mybatis.parsing;

import com.yj.mybatis.mapping.MapperStatement;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类说明
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/25 14:57
 * Copyright 2021 by WiteMedia
 */
public class XPathParser {


    public static Map<String,MapperStatement> dealXml(InputStream inputStream){
        SAXReader reader = new SAXReader();
        Map<String,MapperStatement> mapperStatementMap = new HashMap<String, MapperStatement>();
        try {
            Document read = reader.read(inputStream);
            Element rootElement = read.getRootElement();
            String namespace = rootElement.attribute("namespace").getText();

            List<Element> selects = rootElement.elements("select");
            for (Element select : selects) {
                String id = select.attribute("id").getText();
                String parameterType = select.attribute("parameterType").getText();
                String resultType = select.attribute("resultType").getText();
                String text = select.getText();
                mapperStatementMap.put(namespace + "."+ id,new MapperStatement(namespace,id,parameterType,resultType,
                        text));
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        System.out.println(mapperStatementMap);
        return mapperStatementMap;
    }

//
//    public static void main(String[] args) throws  FileNotFoundException {
//
//        File file = new File("C:\\Users\\hy\\IdeaProjects\\mybatis\\src\\main\\java\\com\\yj\\mapper\\MediaAdAccountDao.xml");
//        InputStream stream = new FileInputStream(file);
//        dealXml(stream);
//    }
}
