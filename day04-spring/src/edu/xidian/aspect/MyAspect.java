package edu.xidian.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面类：增强代码，与切入点结合
 */
public class MyAspect {

    public void myBefore(JoinPoint jp){
        System.out.println("1.前置通知。。。"+jp.getSignature().getName());//连接点方法名
    }

    /**
     * 后置通知获取service方法执行后的返回值
     * Object retValue:service方法执行的返回值
     * @param jp
     */
    public void myAfterReturning(JoinPoint jp){
        System.out.println("3.后置通知。。。"+jp.getSignature().getName());
       // System.out.println("返回值："+retValue);
    }
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("2.环绕通知。。。开启事务。。。"+pjp.getSignature().getName());//切入点就是方法名
        //放行
        Object retObj=pjp.proceed();
        System.out.println("4.环绕通知。。。提交事务。。。");
        return retObj;
    }
    public void myAfterThrowing(JoinPoint jp,Throwable e){
        System.out.println("异常通知。。。"+jp.getSignature().getName()+"==="+e.getMessage());
    }

    public void myAfter(JoinPoint jp){
        System.out.println("最终通知。。。"+jp.getSignature().getName());
    }
}
