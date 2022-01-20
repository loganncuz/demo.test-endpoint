package com.ncuz.endpoint;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class Application {
    @PostConstruct
    private void post(){
    }
    @PreDestroy
    private void destroy(){

    }


    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);
    }

}
