package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;

public class UserAction3 {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save(User user){
        System.out.println("Action save方法 ");

        //保存
        userService.add(user);
    }

}
