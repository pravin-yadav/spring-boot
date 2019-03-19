package com.pravin.SpringProject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
class Greeter {

  @RequestMapping("/pravin")
  String sayHello() {
    return "Hello Pravin Yadav";
  }
}
