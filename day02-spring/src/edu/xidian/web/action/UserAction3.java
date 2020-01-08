package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import edu.xidian.service.UserServiceImpl3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


//@Controller("userActionId")
public class UserAction3 {

    //@Autowired//spring自动注入userService赋值
    //@Qualifier("myUserService")//根据指定的id注入属性
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
