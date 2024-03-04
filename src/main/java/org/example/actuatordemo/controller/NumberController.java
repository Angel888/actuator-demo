package org.example.actuatordemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.actuatordemo.component.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
@Slf4j
@RestController
//@RequestMapping("/number",MediaType.APPLICATION_JSON_UTF8_VALUE)  //todo 为什么报错
@RequestMapping("/number")
public class NumberController {

    // ...

    @Autowired
    private NumberService numberService;

    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
//        MediaType.APPLICATION_JSON_UTF8_VALUE;
        log.info("call numberService to square {}", number);
        return String.format("{\"square\": %s}", numberService.square(number));
    }
}
