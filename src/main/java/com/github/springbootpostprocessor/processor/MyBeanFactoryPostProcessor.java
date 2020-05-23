package com.github.springbootpostprocessor.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor: Bean 的后置处理器, bean 创建对象初始化前后进行拦截工作的
 * BeanFactoryPostProcessor: BeanFactory 的后置处理器
 * 在 BeanFactory 标准初始化之后调用, 所有的 bean 定义已经保存加载到 beanfactory, 但是 bean 的示例还没创建
 * 1.IOC 容器创建对象
 * 2.invokeBeanFactoryPostProcessor(beanFactory);执行 BeanFactoryPostProcessor;
 *      如何找到所有的 FactoryPostProcessor 并执行他们的方法;
 *          1.直接在 BeanFactory 中找到所有类型是 BeanFactoryPostProcessor 的组件,并执行他们的方法
 *          2.在初始化创建其他组件之前执行.
 *  2.BeanDefinitionRegistryPostProcessor
 *      在所有的bean定义信息将要被加载, bean 实例还没创建
 *      优先 BeanFactoryPostProcessor 执行
 *      利用 BeanDefinitionRegistryPostProcessor 给容器中再添加一些额外的组件.
 * 原理:
 * 1.IOC 创建对象
 * 2.refresh -> invokeBeanFactoryPostProcessors(beanFactory)
 * 3.从容器中获取到所有的 BeanDefinitionRegistryPostProcessor 组件.
 *      1.依次触发所有的 postProcessBeanDefinitionRegistry方法
 *      2.再来触发 postProcessorBeanFactory()方法 BeanFactoryPostProcessor
 * 4.
 * <p>
 * 创建时间为 21:11 2019-08-21
 * 项目名称 spring-boot-post-processor
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Slf4j
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("MyBeanFactoryPostProcessor");
        int count = beanFactory.getBeanDefinitionCount();
        String[] names = beanFactory.getBeanDefinitionNames();
        log.info("当前BeanFactory 中有:{}个Bean", count);


    }
}
