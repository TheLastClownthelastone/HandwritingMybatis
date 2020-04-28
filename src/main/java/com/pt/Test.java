package com.pt;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {

  @org.junit.Test
  public void test() throws IOException {
      //声明mybatis文件所在位置
    String resource="mybatis-config.xml";
    //通过配置文件配置获取sqlSessionFactoryBuild
    InputStream inputStream = Resources.getResourceAsStream(resource);
    //获取sqlSessionFactory对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //sqlSessionFactory创建sqlSession链接
    SqlSession session = sqlSessionFactory.openSession();
    UserMapper mapper = session.getMapper(UserMapper.class);
    User user = mapper.selectById(1);
    System.out.println(user);
  }
}
