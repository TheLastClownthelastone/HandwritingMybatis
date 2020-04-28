package com.pt.config;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pt
 * @version 1.0
 * @date 2020/4/28 23:17
 */
@Data
public class Configuration {
    private String jdbcDriver;
    private String jdbcUrl;
    private String jdbcUserName;
    private String jdbcPassWord;
    private Map<String,MappedStatement> mappedStatement=new HashMap<>();

}
