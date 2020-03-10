package edu.xidian.web.action;

import edu.xidian.model.User;
import edu.xidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

//案例4
@Controller//表示控制层
//案例5 多例配置
@Scope("prototype") //打开多例
public class UserAction {
    /**
     * Autowired是根据类型注入
     * 如果你是一个接口，从容器找接口实现类
     * 如果你是一个类，就查找类
     */
    @Autowired//spring自动注入userService赋值[用的较多]
    //@Qualifier("myUserService")根据指定的id注入属性[用的较少]
    //@Resource(name = "myUserService") //等效于前面两行代码[用的较少]
    private UserService userService;

    public void save(User user){
        System.out.println("Action00 save方法 ");

        //保存
        userService.add(user);
    }

}
