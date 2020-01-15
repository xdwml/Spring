package edu.xidian.test;

import edu.xidian.service.MyBeanFactory;
import edu.xidian.service.StudentService;
import org.junit.Test;

public class lesson06 {
    @Test
    public void test1() throws Exception {
        //实现AOP编程，使用cglib代理来实现
        StudentService ss= MyBeanFactory.createstudentService();
        ss.delete();

        ss.update();

        ss.add();
    }
}
