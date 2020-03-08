package edu.xidian.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类：增强代码，与切入点结合
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //拦截方法


        System.out.println("开启事务。。。");
        //放行
        Object retObj=invocation.proceed();

        System.out.println("拦截。。。");

        System.out.println("提交事务。。。");

        return retObj;
    }
}
