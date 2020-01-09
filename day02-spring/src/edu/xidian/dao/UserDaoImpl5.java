package edu.xidian.dao;

import edu.xidian.model.User;
import org.springframework.stereotype.Repository;
//案例4
@Repository
public class UserDaoImpl5 implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("Dao 添加用户:" + user);
    }
}
