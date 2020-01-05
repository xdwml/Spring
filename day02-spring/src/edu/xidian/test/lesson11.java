package edu.xidian.test;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import edu.xidian.web.action.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson11 {
    @Test
    public void test1() throws Exception {
        /**
         * 注解的使用
         * Web 开发流程 action ->service -> dao
         */
        //拿到service
        ApplicationContext context=new ClassPathXmlApplicationContext("beans11.xml");
        UserService userService = (UserService) context.getBean("userService");
        //添加用户
        User user=new User();
        user.setUsername("weml");
        user.setPassword("123456");
        userService.add(user);

    }
    @Test
    public void test2() throws Exception {
        /**
         * 注解的使用
         * Web 开发流程 action ->service -> dao
         */
        //拿到action
        ApplicationContext context=new ClassPathXmlApplicationContext("beans11.xml");
        UserAction userAction = (UserAction) context.getBean("userAction");
        //添加用户
        /*User user=new User();
        user.setUsername("wml");
        user.setPassword("123456");
        userAction.save(user);*/

    }

}
