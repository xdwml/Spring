package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//案例4
@Controller("userActionId")  //表示控制层
public class UserAction5 {

    @Autowired//spring自动注入userService赋值
    @Qualifier("myUserService")
    private UserService userService;

    public void save(User user){
        System.out.println("Action save方法 ");

        //保存
        userService.add(user);
    }

}
