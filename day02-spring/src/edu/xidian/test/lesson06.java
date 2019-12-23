package edu.xidian.test;
import edu.xidian.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 05.bean的生命周期讲解
 */
public class lesson06 {
    @Test
    public void test1() throws Exception {
        //给对象的属性赋值放讲解【】
        ApplicationContext context=new ClassPathXmlApplicationContext("beans6.xml");
        Student stu= (Student) context.getBean("stu");
        System.out.println(stu);

    }

}
