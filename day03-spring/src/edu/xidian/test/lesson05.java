package edu.xidian.test;

import edu.xidian.factory.MyBeanFactory;
import edu.xidian.service.StudentService;
import org.junit.Test;

public class lesson05 {
    @Test
    public void test1() throws Exception {
        //实现AOP编程，使用cglib代理来实现
        StudentService ss= MyBeanFactory.createstudentService();
        ss.delete();

       // ss.update();

       // ss.add();
    }
}
