package edu.xidian.test;

import edu.xidian.model.User;
import edu.xidian.web.action.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson12 {

    @Test
    public void test1() throws Exception {

        //注解的使用
        //web开发流程 action -> service -> dao
        ApplicationContext context = new ClassPathXmlApplicationContext("beans12.xml");


        //获取action
        UserAction userAction =  context.getBean(UserAction.class);

        //添加用户
        User user = new User();
        user.setUsername("gyf");
        user.setPassword("1234");
        userAction.save(user);
    }
}
