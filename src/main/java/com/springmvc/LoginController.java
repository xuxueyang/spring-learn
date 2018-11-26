package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController
{
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/logined")
    public String logined(@RequestParam("account") String account,
                          @RequestParam("password") String password,
                          HttpSession session){
        if(account.equals("xuke")&&password.equals("123456")){
            session.setAttribute("seesion_user","xuke");
            return "redirect:usr/search";
        }else{
            return "redirect:login";
        }
    }
}
