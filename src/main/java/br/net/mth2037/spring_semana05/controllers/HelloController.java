package br.net.mth2037.spring_semana05.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/olaAluno")
    public String olaAluno(@RequestParam String aluno){
        return "Ola "+ aluno +"!";
    }
    @GetMapping("/olaMundo")
    public String olaMundo(){
        return "Ola, Mundo!";
    }
}
