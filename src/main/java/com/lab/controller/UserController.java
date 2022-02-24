package com.lab.controller;

import com.lab.controller.utils.ReturnBean;
import com.lab.controller.utils.Token;
import com.lab.domain.User;
import org.apache.ibatis.annotations.Options;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/login")
    public ReturnBean login(@RequestBody User user){
        Token token = new Token();
        token.setToken("1215451315542");
        ReturnBean bean = new ReturnBean();
        bean.setStatus(true);
        bean.setData(token);
        return bean;
    }

    @PostMapping("/info")
    public String login(@RequestBody Token token){

        return "success";
    }

    @Options
    public String options(){
        return "success";
    }
}
