package edu.xidian.service;

import edu.xidian.dao.UserDao;
import edu.xidian.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class UserServiceImpl implements UserService {
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
        System.out.println("service 添加用户:" + user);
    }
    public UserServiceImpl() {
        System.out.println("UserServiceImpl被调用了");
    }
}