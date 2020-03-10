package edu.xidian.test;

import edu.xidian.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson01 {
    @Test
    public void test1() throws Exception {
       //获取Spring容器中代理对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans01.xml");
        IUserService userService= (IUserService) context.getBean("userService");
        userService.deleteUser();

    }
}
