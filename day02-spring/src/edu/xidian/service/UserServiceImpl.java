package edu.xidian.service;

import edu.xidian.dao.UserDao;
import edu.xidian.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component//Component没配置id
//@Component("userService")//Component配置id
@Service("myUserService")
public class UserServiceImpl implements UserService {

    @Autowired //spring会自动注入userDao赋值
    private UserDao userDao;

    @Override
    public void add(User user) {
        System.out.println("service 添加用户:" + user);
        //调用dao
        userDao.add(user);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户...." + name);
    }




    public UserServiceImpl() {
        System.out.println("UserServiceImpl（）调用了");
    }
}