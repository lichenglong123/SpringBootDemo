package com.example.demo;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private static Log logger = LogFactory.getLog(DemoApplicationTests.class);
    @Test
    public void contextLoads() {
        logger.info("11111111111111");
    }

}
