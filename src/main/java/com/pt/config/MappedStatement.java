package com.pt.config;

import lombok.Data;

/**
 * 读取Mapper文件中的配置信息
 * @author pt
 */
@Data
public class MappedStatement {

        private String namespace;
        private  String sourceId;
        private String  resultType;
        private String sql;

}
