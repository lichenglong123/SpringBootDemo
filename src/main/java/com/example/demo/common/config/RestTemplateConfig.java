package com.example.demo.common.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jack
 * @description: TODO
 * @date 2019/6/2618:20
 */
@Configuration
public class RestTemplateConfig {
    private static Log logger = LogFactory.getLog(RestTemplateConfig.class);
    @Bean
    public RestTemplate restTemplate(){
        logger.info("******初始化restTemplate******");
        return new RestTemplate();
    }

}
