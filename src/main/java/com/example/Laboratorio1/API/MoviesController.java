package com.example.Laboratorio1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Laboratorio1.Model.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MoviesController {

// Array de todas las peliculas
    private static ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(
        new Movie(1, 1997, "La vida es bella"),
        new Movie(2, 1994, "Forrest Gump"),
        new Movie(3, 2000, "Gladiator"),
        new Movie(4, 2001, "Monstruos S.A"),
        new Movie(5, 1990, "Eduardo Manostijeras")

    ));
    // Obtengo todas las peliculas
    @GetMapping("/peliculas")
     public List<Movie> getAll(){

        return movies;
    }
}
