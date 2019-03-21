package com.pravin.SpringProject;

import com.pravin.SpringProject.Polymorphism.OverloadingExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

  public static void main(String[] args) {
    System.out.println(OverloadingExample.add(1, 2));
    System.out.println(OverloadingExample.add(1, 2, 3));
    System.out.println(OverloadingExample.add(1, 2, 3, 4));
    System.out.println(OverloadingExample.add(1.0, 2.0, 3.0, 4.0, 5.0));
    //    SpringApplication.run(SpringProjectApplication.class, args);
  }
}
