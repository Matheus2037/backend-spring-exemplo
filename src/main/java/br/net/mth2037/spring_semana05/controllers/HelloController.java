package br.net.mth2037.spring_semana05.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/olaMundo")
    public String olaMundo(){
        return "Ola, Mundo!";
    }
}
