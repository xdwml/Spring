package edu.xidian.service;

import edu.xidian.dao.UserDao;
import edu.xidian.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 注解注入-案例1&2
 */
//@Component//案例1 Component没配置id
@Component("userService")// 案例2 Component配置id
public class UserServiceImpl12 implements UserService {



    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户：" + name);
    }

    @Override
    public void add(User user) {
        System.out.println("添加用户："+user);
    }

    public UserServiceImpl12() {
        System.out.println("UserServiceImpl12被调用了");
    }
}