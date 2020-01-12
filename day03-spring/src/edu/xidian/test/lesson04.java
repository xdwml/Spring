package edu.xidian.test;

import edu.xidian.service.IUserService;
import edu.xidian.service.MyBeanFactory;
import org.junit.Test;

/**
 * 注解注入-案例4
 */
public class lesson04 {
    @Test
    public void test1() throws Exception {
        //自己实现AOP编程，使用JDK代理来实现
        IUserService userService= MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();

        userService.deleteUser();
        userService.deleteUser(10);
    }
}
