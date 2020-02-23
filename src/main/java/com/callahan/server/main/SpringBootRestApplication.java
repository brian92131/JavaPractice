package com.callahan.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.callahan."})

public class SpringBootRestApplication {

       public static void main(String[] args) {
              SpringApplication.run(SpringBootRestApplication.class, args);

       }

}