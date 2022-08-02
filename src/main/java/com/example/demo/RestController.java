package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping()
    public String init(){
        return "changesss";
    }

    @GetMapping()
    public String getInit(){
        return "get init";
    }


}
