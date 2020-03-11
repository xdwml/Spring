package edu.xidian.test;

import edu.xidian.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson02 {
    @Test
    public void test1() throws Exception {
       //使用注解来配置AOP
        ApplicationContext context=new ClassPathXmlApplicationContext("beans02.xml");
        IUserService userService= (IUserService) context.getBean("userService");
        userService.deleteUser();

    }
}
