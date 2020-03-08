package edu.xidian.aspect;

/**
 * 切面类：增强代码，与切入点结合
 */
public class MyAspect2 {
    public void before(){
        System.out.println("开启事务。。。");
    }


    public void after(){
        System.out.println("提交事务。。。");
    }
}
