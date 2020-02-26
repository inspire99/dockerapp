package com.example.docker.dockerapp.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/say/hi")
public class HelloResource {

    @GetMapping
    public String sayHi(){
        return "Hi docker";
    }
}
