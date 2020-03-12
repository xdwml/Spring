package edu.xidian.service;

import org.springframework.stereotype.Service;

//案例4
@Service("userService")  //表示Service层
public class IUserServiceImpl implements IUserService {

    @Override
    public void addUser() {
        System.out.println("添加用户。。。");
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户。。。");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户。。。");
    }

    @Override
    public int deleteUser(int id) {
        System.out.println("通过id删除用户");
        return 1;
    }
}