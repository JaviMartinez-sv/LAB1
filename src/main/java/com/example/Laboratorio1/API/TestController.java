package com.example.Lab1.API;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
   
// Mostrar pelicula en HTML
    @GetMapping("/testHtml2")
    public String Test2() {
        return "test2";
    }

// Mostrar desplegable
    @GetMapping("/testHtml")
    public String Test() {
        return "test";
    }


}
