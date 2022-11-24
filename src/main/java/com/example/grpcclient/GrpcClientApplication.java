package com.example.grpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.user")
public class GrpcClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(GrpcClientApplication.class, args);
  }

}
