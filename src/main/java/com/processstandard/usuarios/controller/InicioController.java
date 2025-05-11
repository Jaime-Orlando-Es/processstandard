package com.processstandard.usuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String mostrarInicio() {
        return "index";  // Esto busca index.html en src/main/resources/templates/
    }
    
}
