package edu.xidian.test;

import edu.xidian.model.User;
import edu.xidian.web.action.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解注入-案例4
 */
public class lesson01 {
    @Test
    public void test1() throws Exception {
        //注解的使用
        //web开发流程 action -> service -> dao
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        //获取action
        UserAction userAction =  context.getBean(UserAction.class);
        //添加用户
        User user = new User();
        user.setUsername("gyf");
        user.setPassword("1234");
        userAction.save(user);

        UserAction userAction2 =  context.getBean(UserAction.class);
        System.out.println(userAction);
        System.out.println(userAction2);//因为默认是单例，打印地址值一样

        //关闭容器
        context.getClass().getMethod("close").invoke(context);
    }
}
