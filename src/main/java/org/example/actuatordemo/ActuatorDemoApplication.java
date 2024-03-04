package org.example.actuatordemo;

import org.example.actuatordemo.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCaching
//@Import({HelloController.class, })
public class ActuatorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorDemoApplication.class, args);
    }

    @RequestMapping("/2")
    public String index() {
        return "Hello Spring Boot 3.x!";
    }
}
