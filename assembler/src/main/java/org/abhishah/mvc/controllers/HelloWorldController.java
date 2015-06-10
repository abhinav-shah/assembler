package org.abhishah.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HelloWorldController {

  @RequestMapping()
  public String helloWorld() {
    return "index";
  }
}
