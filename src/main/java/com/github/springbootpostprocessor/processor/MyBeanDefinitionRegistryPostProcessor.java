package com.github.springbootpostprocessor.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 21:27 2019-08-21
 * 项目名称 spring-boot-post-processor
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Slf4j
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    /**
     * BeanDefinitionRegistry Bean 定义信息的保存中心,
     * 以后BeanFactory 就是按照 BeanDefinitionRegistry里面保存的每一个bean 定义的信息创建bean示例
     *
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        log.info("MyBeanDefinitionRegistryPostProcessor:postProcessBeanDefinitionRegistry:bean的数量:{}", registry.getBeanDefinitionCount());


    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        log.info("MyBeanDefinitionRegistryPostProcessor:postProcessBeanFactory");

    }
}
