package com.liny.mall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author linyi
 * @date 2022/8/26
 * 1.0
 */
@Configuration
public class MysqlConfig {

    //从spring-config配置中心获取mysql的配置文件：
    @Bean
    @ConfigurationProperties(prefix="spring.datasource.durid")
    public DataSource dataSource(){
        return new DriverManagerDataSource();
    }

}
