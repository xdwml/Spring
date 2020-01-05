package edu.xidian.dao;

import edu.xidian.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("dao 添加用户:" + user);
    }
}
