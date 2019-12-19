package edu.xidian.model;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean,String beanName){
        //这边可用于多个对象共同的事情的处理
        System.out.println("5.预处理："+bean+":"+beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean,String beanName){
        System.out.println("8.后处理："+bean+":"+beanName);
        return bean;
    }
}
