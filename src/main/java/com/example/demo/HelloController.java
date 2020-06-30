package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author tiantongyi
 * @date 2020年6月17日
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String welcom() {
        return "Hello SpringBoot";
    }
}
