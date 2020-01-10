package edu.xidian.service;

public class UserServiceFactory2 {
    public UserService createUserService(){
        return new UserServiceImpl();
    }
}
