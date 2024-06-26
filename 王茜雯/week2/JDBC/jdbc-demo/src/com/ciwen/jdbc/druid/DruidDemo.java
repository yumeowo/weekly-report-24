package com.ciwen.jdbc.druid;

//import com.alibaba.druid.support.ibatis.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/*
*Druid数据库连接池演示
*/
public class DruidDemo {
    public static void main(String[] args) throws Exception{
        //1.导入jar 包

        //2.定义复制文件

        //3.加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        //4.获取链接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5.获取对应数据库连接
        Connection connection =dataSource.getConnection();

        System.out.println(connection);

        //System.out.println("user.dir");
    }
}
