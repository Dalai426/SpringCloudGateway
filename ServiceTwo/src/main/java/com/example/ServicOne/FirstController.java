package com.example.ServicOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class FirstController {
    @GetMapping("/message")
    public String test(@RequestHeader("second-request") String header) {
        System.out.println(header);
        return "Called in Second Service";
    }
}