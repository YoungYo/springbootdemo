package com.bjsxt.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * 数据源的JDBC配置类
 * @author wanghao
 */
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class) //指定加载哪个配置信息属性类
public class JdbcConfiguration {
//    @Autowired
//    private JdbcProperties jdbcProperties;
//    private JdbcProperties jdbcProperties;

//    public JdbcConfiguration(JdbcProperties jdbcProperties) {
//        this.jdbcProperties = jdbcProperties;
//    }

//    /**
//     * 实例化Druid
//     */
//    @Bean
//    public DataSource getDataSource(JdbcProperties jdbcProperties) {
//        DruidDataSource source = new DruidDataSource();
//        source.setDriverClassName(jdbcProperties.getDriverClassName());
//        source.setUrl(jdbcProperties.getUrl());
//        source.setUsername(jdbcProperties.getUsername());
//        source.setPassword(jdbcProperties.getPassword());
//        return source;
//    }

    /**
     * 实例化Druid
     */
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource() {
        DruidDataSource source = new DruidDataSource();
        return source;
    }
}
