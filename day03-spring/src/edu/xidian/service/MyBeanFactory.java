package edu.xidian.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static IUserService createUserService(){
        //1.创建目标对象target
        final IUserService userService=new IUserServiceImpl();
        //2.声明切面类对象
        MyAspect aspect=new MyAspect();//1.8之后默认加final

        //3.把切面类2个方法 应用 目标类
        //3.1创建JDK代理
        /**
         * newProxyInstance(ClassLoader loader, 类加载器，写当前类
                            Class<?>[] interfaces,接口，接口方法会被拦截
                            InvocationHandler h)  处理，
         */
        IUserService serviceProxy=(IUserService) Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //开启事务
                        aspect.before();
                        //方法返回值是业务方法的返回值
                        Object retObj=method.invoke(userService,args);//拦截方法放行
                        System.out.println("拦截返回值："+retObj);

                        //提交事务
                        aspect.after();


                        return retObj;
                    }
                });


        return serviceProxy;
    }
}
