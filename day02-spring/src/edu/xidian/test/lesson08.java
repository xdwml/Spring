package edu.xidian.test;
import edu.xidian.model.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 08 SpEL Spring表达式
 */
public class lesson08 {
    @Test
    public void test1() throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans8.xml");
        Customer customer= (Customer) context.getBean("customer");
        System.out.println(customer);
        System.out.println(customer.getAddress());

    }

}
