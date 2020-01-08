package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class UserAction4 {

    @Autowired//spring自动注入userService赋值
    //@Qualifier("myUserService")//根据指定的id注入属性
    private UserService userService;

    public void save(User user){
        System.out.println("Action save方法 ");

        //保存
        userService.add(user);
    }

}
