package org.hackday.ksr.presentation.api;


import org.hackday.ksr.domain.User.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class InitApiController {



    @GetMapping("/test")
    public @ResponseBody UserAccount tHello(){


        return new UserAccount("asdf","asdfff","dfdf","01230");
    }


    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }



}
