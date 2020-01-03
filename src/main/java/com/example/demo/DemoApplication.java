package com.example.demo;

import com.example.demo.common.listener.MyEvent;
import com.example.demo.common.listener.WebContextListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBoot启动类
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(DemoApplication.class, args);
      //  context.addApplicationListener(new WebContextListener());
       // context.publishEvent(new MyEvent("测试事件."));
    }


}
