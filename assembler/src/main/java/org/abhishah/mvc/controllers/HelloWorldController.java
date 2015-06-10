package org.abhishah.mvc.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HelloWorldController {

  private static final Logger LOG = LogManager.getLogger();

  @RequestMapping()
  public String helloWorld() {
    LOG.debug("Inside hello world controller");
    return "index";
  }
}
