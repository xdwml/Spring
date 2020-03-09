package edu.xidian.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类：增强代码，与切入点结合
 */
public class MyAspect3 {
    public void myBefore(){
        System.out.println("前置通知。。。");
    }
    public void myAfterReturning(){
        System.out.println("后置通知。。。");
    }
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知。。。");
        System.out.println(pjp.getSignature().getName());//切入点就是方法名
        System.out.println("开启事务。。。");
        //放行
        Object retObj=pjp.proceed();
        System.out.println("提交事务。。。");
        return retObj;
    }
}
