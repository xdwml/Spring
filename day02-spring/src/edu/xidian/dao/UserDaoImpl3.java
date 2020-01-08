package edu.xidian.dao;

import edu.xidian.model.User;
import org.springframework.stereotype.Repository;
//@Repository
public class UserDaoImpl3 implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("Dao 添加用户:" + user);
    }
}
