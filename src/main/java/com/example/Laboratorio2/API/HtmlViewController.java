package com.example.Laboratorio2.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlViewController {
    
    @GetMapping("/html")
    public ModelAndView movies() {
        ModelAndView vista = new ModelAndView("index3");
        vista.addObject("movies", MoviesController.movies);
        return vista;
    }



    @GetMapping("/html/{id}")
   public ModelAndView movie(@PathVariable("id") int id) {
      ModelAndView vista = new ModelAndView("index4");
      vista.addObject("movies", MoviesController.findById(id));
      return vista;

   }
}

