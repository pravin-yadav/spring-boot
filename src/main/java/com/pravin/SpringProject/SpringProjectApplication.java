package com.pravin.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

  public static void main(String[] args) {
    Greeter greet = new Greeter();
    SpringApplication.run(SpringProjectApplication.class, args);
    greet.sayHello();
    greet.sayMorning();
  }
}
