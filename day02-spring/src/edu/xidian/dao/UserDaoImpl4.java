package edu.xidian.dao;

import edu.xidian.model.User;
import org.springframework.stereotype.Repository;
//案例3
//@Repository
public class UserDaoImpl4 implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("Dao4 添加用户:" + user);
    }
}
