package edu.xidian.factory;

import edu.xidian.aspect.MyAspect2;
import edu.xidian.service.IUserService;
import edu.xidian.service.IUserServiceImpl;
import edu.xidian.service.StudentService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    /**
     * JDK实现的代理
     * @return
     */
    public static IUserService createUserService(){
        //1.创建目标对象target
        final IUserService userService=new IUserServiceImpl();
        //2.声明切面类对象
        MyAspect2 aspect=new MyAspect2();//1.8之后默认加final

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
    /**
     * cglib实现的代理
     * @return
     */
    public static StudentService createstudentService(){
        //1.创建目标对象target
        final StudentService studentService=new StudentService();
        //2.声明切面类对象
        MyAspect2 aspect=new MyAspect2();//1.8之后默认加final
        //3.创建增强对象
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(studentService.getClass());
        //设置回调【拦截】
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                /**
                 * proxy:
                 * class edu.xidian.service.StudentService$$EnhancerByCGLIB$$93231cc5
                 * proxy代理对象是StudentService的子类
                 */

                System.out.println(methodProxy);
                //System.out.println(proxy);
                aspect.before();
                //执行目标类的方法
                //Object retObj = method.invoke(studentService,args);
                //执行代理类的方法（目标类和代理类是父子关系）
                Object retObj = methodProxy.invokeSuper(proxy,args);//解耦
                System.out.println("拦截。。。");
                System.out.println(proxy);
                System.out.println(methodProxy);
                aspect.after();
                return retObj;
            }
        });
        //创建代理对象
        StudentService serviceProxy= (StudentService) enhancer.create();
        //System.out.println(serviceProxy);
        return serviceProxy;
    }
}
