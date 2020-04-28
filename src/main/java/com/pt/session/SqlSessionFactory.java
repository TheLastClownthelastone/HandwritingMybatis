package com.pt.session;

/**
 * @author pt
 * @version 1.0
 * @date 2020/4/28 23:24
 */

import com.pt.config.Configuration;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * 在实例化的过程中加载配置文件到 configuration对象中
 * 生产SqlSession
 * @author Administrator
 */
public class SqlSessionFactory {

    private final Configuration configuration=new Configuration();

    public SqlSessionFactory() {
        loadDbInfo();
        loadMapperInfo();
    }


    /**
     * 在mapper配置文件的信息
     */
    private void loadMapperInfo() {
        File file=new File("mapper");
        if(file.isDirectory()){
            File[] files = file.listFiles(f -> f.getName().endsWith(".xml"));
            if(files!=null&&files.length>0){

            }
        }

    }

    /**
     * 加载数据库配置文件信息
     */
    private void loadDbInfo() {
    
    }



}
