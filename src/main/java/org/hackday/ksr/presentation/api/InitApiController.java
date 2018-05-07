package org.hackday.ksr.presentation.api;


import org.hackday.ksr.domain.user.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class InitApiController {



    @GetMapping("/test")
    public @ResponseBody UserAccount tHello(){


        return new UserAccount("asdf","asdfff",new Date());
    }


    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }



}
