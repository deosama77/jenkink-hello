package com.example.jenkin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/hello")
    public String getHello(){
         return  "Hello world is done update 1 299 yyy ooo ppp";
    }
}
