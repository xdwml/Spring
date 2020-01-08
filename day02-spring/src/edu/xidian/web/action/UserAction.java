package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;



public class UserAction{

    private UserService userService;

    public void save(User user){
        System.out.println("action save方法 ");
        userService.add(user);
    }
}
