package com.rushMotors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPid;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        System.setProperty("spring.config.location", "classpath:/opt/");
        SpringApplication.run(Application.class,args);
    }
}
