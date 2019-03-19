package com.pravin.SpringProject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
class Greeter {

  @RequestMapping("/")
  String sayHello() {
    return "Hello Pravin Yadav";
  }

  @RequestMapping("/morning")
  String sayMorning() {
    return "Hello Goodmorning Pravin Yadav";
  }
}
