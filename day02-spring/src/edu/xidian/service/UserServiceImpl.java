package edu.xidian.service;

import edu.xidian.model.User;

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
        System.out.println("0创建用户：" + name);
    }
    @Override
    public void add(User user) {
        System.out.println("service0 添加用户:" + user);
    }
    public UserServiceImpl() {
        System.out.println("UserServiceImpl0被调用了");
    }
}