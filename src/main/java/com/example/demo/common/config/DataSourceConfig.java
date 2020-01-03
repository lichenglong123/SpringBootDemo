package com.example.demo.common.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;


/**
 * @author Jack
 * @description: 数据库链接池配置
 * @date 2019/4/1213:32
 */
@Configuration
public class DataSourceConfig {
    @Value("${spring.datasource.c3p0.user}")
    private String jdbcUrl;


    private static Log logger = LogFactory.getLog(DataSourceConfig.class);
    @Bean("dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.c3p0")
    public DataSource initDataSource(){
        logger.info("*********初始化数据源配置信息********");
        return  DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
    }
}
