package com.example.demo.common.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Jack
 * @description: TODO
 * @date 2019/8/23 15:02
 */
@Component
public class WebContextListener implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger logger= LoggerFactory.getLogger(WebContextListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n======================================================================\r\n");
        sb.append("\r\n    欢迎使用 商家PC版后台 - 系统开始运行");
        sb.append("\r\n======================================================================\r\n");
        logger.info(sb.toString());
    }
}
