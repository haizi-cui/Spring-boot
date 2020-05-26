package com.example.demo;

/**
 * Jdbc数据源的配置类
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
@PropertySource("classpath:/jdbc.properties") //加载指定的propertirs文件
public class JdbcConfiguration {

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String driverclassName;

    /**
     * 实例化Druid
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setUsername(this.username);
        source.setPassword(this.password);
        source.setUrl(this.url);
        source.setDriverClassName(this.driverclassName);
        return source;
    }
}
