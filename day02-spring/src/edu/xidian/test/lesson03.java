package edu.xidian.test;

import edu.xidian.service.UserService;
import edu.xidian.service.UserServiceFactory1;
import edu.xidian.service.UserServiceFactory2;
import edu.xidian.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class lesson03 {
    @Test
    public void test1() {
        /*
        装配bean的三种方式，所谓的装配bean就是在xml写一个bean标签
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
        //第一种方式：new 实现类
        //装配之前
        //UserService userService1 =new UserServiceImpl();
        //userService1.add();
        //装配之后
        //UserService userService1 = (UserService) context.getBean("userService1");
        //userService1.add();
        //第二种方式：通过静态工厂方法
        //装配之前
        //UserService userService2 =UserServiceFactory1.createUserService();
        //userService2.add();
        //装配之后
        //UserService userService2 = (UserService) context.getBean("userService2");
        //userService2.add();
        //第三种方式：通过实例工厂方法
        //装配之前
        //UserServiceFactory2 factory2=new UserServiceFactory2();
        //UserService userService3 =factory2.createUserService();
        //userService3.add();
        //装配之后
        UserService userService3 = (UserService) context.getBean("userService3");
        userService3.add();
    }

}
