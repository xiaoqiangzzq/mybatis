package com.yj.mybatis.parsing;

import com.yj.mybatis.mapping.MapperStatement;
import com.yj.mybatis.mapping.MyConfiguration;
import com.yj.mybatis.mapping.MyEnvironment;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 解析mybatis-config.xml
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/25 14:58
 * Copyright 2021 by WiteMedia
 */
public class XMLConfigBuilder {

    //使用dom4j解析
    public static MyConfiguration dealXml(InputStream inputStream) throws FileNotFoundException {


        SAXReader reader = new SAXReader();
        List<String> jdbcList = new ArrayList<String>();
        try {
            Document document = reader.read(inputStream);
            Element rootElement = document.getRootElement();
            Element environments = rootElement.element("environments");
            Element environment = environments.element("environment");
            Element dataSource = environment.element("dataSource");
            List<Element> property = dataSource.elements("property");
            for (Element o : property) {
                Attribute name = o.attribute("name");
                Attribute value = o.attribute("value");
                System.out.println(name.getText() + ":" + value.getText());
                jdbcList.add(value.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        MyEnvironment myEnvironment = new MyEnvironment(jdbcList.get(0), jdbcList.get(1), jdbcList.get(2), jdbcList.get(3));

        //此处应该读取mybatis-config.xml中的dao文件位置
        File file = new File("C:\\Users\\hy\\IdeaProjects\\mybatis\\src\\main\\java\\com\\yj\\mapper\\MediaAdAccountDao.xml");
        InputStream stream = new FileInputStream(file);
        Map<String, MapperStatement> stringMapperStatementMap = XPathParser.dealXml(stream);


        return new MyConfiguration(myEnvironment, stringMapperStatementMap);

    }

//    public static void main(String[] args) throws FileNotFoundException {
//
//        File file = new File("C:\\Users\\hy\\IdeaProjects\\mybatis\\src\\main\\resources\\mybatis-config.xml");
//        InputStream stream = new FileInputStream(file);
//        dealXml(stream);
//    }

}
