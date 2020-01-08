package edu.xidian.test;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import edu.xidian.service.UserServiceImpl12;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解注入-案例1&2
 */
public class lesson10 {
    @Test
    public void test1() throws Exception {
        /**
         * 注解注入 取代xml中的 Bean配置
         */
        //Bean方式
        /*ApplicationContext context=new ClassPathXmlApplicationContext("beans10.xml");
        UserService userService= (UserServiceImpl) context.getBean("userService");
        User user=new User();
        user.setUsername("wml");
        userService.add(user);*/
        //注解方式
        /**
         * 1. Sping默认情况下，注解不生效，开启注解功能
         * 2. 如何开启spring注解功能？
         *  在.xml中配置两行代码
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("beans10.xml");
        //1.如果Component没配置id,通过类型来获取
        //2.这个类型可以是接口，也可以是实现类
        //UserService userService= context.getBean(UserService.class);// 案例1
        //UserService userService= context.getBean(UserServiceImpl12.class);// 案例1
        //如果Component("userService")配置id,通过类型来获取
        UserService userService= (UserService) context.getBean("userService");// 案例2
        User user=new User();
        user.setUsername("wml");
        user.setPassword("123456");
        userService.add(user);
    }

}
