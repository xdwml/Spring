package edu.xidian.service;

import edu.xidian.dao.UserDao;
import edu.xidian.dao.UserDaoImpl4;
import edu.xidian.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//案例3
@Service  //表示Service层
public class UserServiceImpl4 implements UserService {

    @Autowired //spring会自动注入userDao赋值
    private UserDao userDao;
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
        //调用dao
        userDao.add(user);
    }
    public UserServiceImpl4() {
        System.out.println("UserServiceImpl4被调用了");
    }


}