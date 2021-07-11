package com.tkk.review.sprintbootstarter.webstart.restController;

import com.tkk.review.sprintbootstarter.webstart.beanVO.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author fendoukaoziji
 * @time 2021-07-11 17:19
 * @action 功能描述
 **/
@RestController
@RequestMapping(value="/user")
public class UserController {
    @RequestMapping(value="login")
    public Object login(HttpServletRequest request){
        //用户信息放入session中
        User user = new User();
        user.setId(1001);
        user.setUserName("firstBlood");
        request.getSession().setAttribute("user",user);
        return "login success";
    }
    @RequestMapping(value="/center")
    public Object center(){
        return "see center message";
    }

    @RequestMapping(value="/out")
    public Object out(){
        return "see center out";
    }

    @RequestMapping(value="/error")
    public Object error(){
        return "抱歉";
    }
}
