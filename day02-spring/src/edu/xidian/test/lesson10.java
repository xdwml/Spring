package edu.xidian.test;
import edu.xidian.model.Programmer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lesson10 {
    @Test
    public void test1() throws Exception {
        /**
         * Bean的集合注入
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("beans9.xml");
        Programmer programmer= (Programmer) context.getBean("programmer");
        System.out.println("车："+programmer.getCars());
        System.out.println("宠物："+programmer.getPats());
        System.out.println("个人信息："+programmer.getInfos());
        System.out.println("数据库信息："+programmer.getMysqlInfos());
        System.out.print("家庭成员：");
        for (String member:programmer.getMembers()) {
            System.out.print(member+";");
        }
    }

}
