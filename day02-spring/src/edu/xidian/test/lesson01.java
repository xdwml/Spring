package edu.xidian.test;

import edu.xidian.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * 01.Spring容器创建的三种方式讲解
 */
public class lesson01 {
    @Test
    public void test1() {
        //Spring 容器加载的3种方式
        //第一种：ClassPathXmlApplicationContext  类路径【相对路径】
        //ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //UserService user = (UserService) context.getBean("userService");
        //user.add();
        //第二种：文件路径 【绝对路径】
        //ApplicationContext context=new FileSystemXmlApplicationContext("E:\\IDEA\\Spring\\day02-spring\\src\\beans.xml");
        //UserService user = (UserService) context.getBean("userService");
        //user.add();
        //第三种方式：BeanFactory(了解)
        String path="E:\\IDEA\\Spring\\day02-spring\\src\\beans.xml";
        BeanFactory factory=new XmlBeanFactory(new FileSystemResource(path));
        UserService user = (UserService) factory.getBean("userService");
        user.add();
    }

}
