package br.com.victorhm.cadastro_de_ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/welcome")
    public String boasVindas() {
        return "Welcome to my first API application!";
    }

}
