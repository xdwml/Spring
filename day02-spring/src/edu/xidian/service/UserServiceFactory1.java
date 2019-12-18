package edu.xidian.service;

public class UserServiceFactory1 {
    public static UserService createUserService(){
        return new UserServiceImpl();
    }
}
