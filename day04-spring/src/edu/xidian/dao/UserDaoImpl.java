package edu.xidian.dao;

import edu.xidian.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//案例4
@Repository

public class UserDaoImpl implements UserDao{

    //<bean init-method="" destroy-method=""></bean>
    @PostConstruct  //相当于init-method
    public void myInit(){
        System.out.println("userDaoImpl自定义初始化方法");
    }

    @PreDestroy //相当于 destory-method
    public void myDestory(){
        System.out.println("userDaoImpl自定义销毁");
    }


    @Override
    public void add(User user) {
        System.out.println("Dao00 添加用户:" + user);
    }


}
