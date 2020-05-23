package com.github.springbootpostprocessor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootPostProcessorApplicationTests {

    @Resource
    private ConfigurableApplicationContext context;

    @Test
    public void contextLoads() {
        context.close();
    }

}
