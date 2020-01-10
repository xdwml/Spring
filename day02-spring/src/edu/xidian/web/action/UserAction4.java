package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


//案例3
@Controller  //表示控制层
public class UserAction4 {

    @Autowired//spring自动注入userService赋值
    private UserService userService;

    public void save(User user){
        System.out.println("Action4 save方法 ");

        //保存
        userService.add(user);
    }

}
