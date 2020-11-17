package com.example.Laboratorio2.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HtmlViewController {
    
    @GetMapping("/html")
    public ModelAndView movies() {
        ModelAndView vista = new ModelAndView("index");
        vista.addObject("movies", MoviesController.movies);
        return vista;
    }


}
