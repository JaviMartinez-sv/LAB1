package com.example.Laboratorio2.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

// Mostrar pelicula en HTML - Ejer 7
@GetMapping("/testHtml2")
    public String Test2() {
        return "test2";
    }

// Mostrar desplegable - Ejer 8
    @GetMapping("/testHtml")
    public String Test() {
        return "test";
    }



}


