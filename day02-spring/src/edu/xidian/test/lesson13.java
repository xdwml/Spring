package edu.xidian.test;

import edu.xidian.model.User;
import edu.xidian.web.action.UserAction5;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解注入-案例4
 */
public class lesson13 {
    @Test
    public void test1() throws Exception {
        //注解的使用
        //web开发流程 action -> service -> dao
        ApplicationContext context = new ClassPathXmlApplicationContext("beans12.xml");
        //获取action
        UserAction5 userAction =  context.getBean(UserAction5.class);
        //添加用户
        User user = new User();
        user.setUsername("gyf");
        user.setPassword("1234");
        userAction.save(user);
    }
}
