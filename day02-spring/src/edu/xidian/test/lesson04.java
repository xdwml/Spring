package edu.xidian.test;

import edu.xidian.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 04.bean的作用域讲解
 */
public class lesson04 {
    @Test
    public void test1() {
        /*bean的作用域*/
        ApplicationContext context=new ClassPathXmlApplicationContext("beans4.xml");
        //单例
        //从容器中获取两个bean
        /*UserService userService1 = (UserService) context.getBean("userService");
        UserService userService2 = (UserService) context.getBean("userService");
        System.out.println(userService1);//两个对象同一个地址
        System.out.println(userService2);*/
        //多例
        //从容器中获取两个bean
        UserService userService3 = (UserService) context.getBean("userService");
        UserService userService4 = (UserService) context.getBean("userService");
        System.out.println(userService3);//两个对象不同地址
        System.out.println(userService4);

    }

}
