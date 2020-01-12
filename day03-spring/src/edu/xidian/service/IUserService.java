package edu.xidian.service;

import edu.xidian.model.User;
//切面编程
public interface IUserService {
    public void addUser();
    public void updateUser();
    public void deleteUser();
    public int deleteUser(int id);
}
