package org.hackday.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitApiController {

  @GetMapping("/hello")
  public String hello() {

    return "hello";
  }
}
