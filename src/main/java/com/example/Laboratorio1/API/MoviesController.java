package com.example.Laboratorio1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import com.example.Laboratorio1.Model.Movie;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

     
    // Obtengo peliculas por titulo
    @GetMapping("/peliculas/titulo/{title}")
    public Movie ObtenerPorTitulo(@PathVariable("title") String title){
        for(Movie movie : movies){
            if (movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }

    // Obtengo peliculas por año
    @GetMapping("peliculas/año/{year}")
    public Movie ObtenerPorAño(@PathVariable("year") int year){
        for(Movie movie : movies){
            if (movie.getYear() == year) {
                return movie;
            }
        }
        return null;
    }

    // Crear una pelicula
    @PostMapping("/movie")
    public Movie createMovie(@RequestBody Movie newMovie){
        for (Movie movie : movies){
            if(movie.getTitle() == newMovie.getTitle()){
                return null;
            }
        }
        movies.add(newMovie);
        return newMovie;
    }
    // Borrar una pelicula
    @DeleteMapping("/movie/delete/{title}")
    public Movie deleteMovie(@PathVariable("title") String title ){
        for (Movie movie : movies){
            if(movie.getTitle() == title) {
                movies.remove(movie);
                return null;
            }
        }
        return null;
    }

    //Modificar una Pelicula
    @PutMapping("/movie/modify/{title}")
    public Movie modifyMovie(@RequestBody Movie nameTitle, @PathVariable("title") String title){
        for (Movie movie : movies){
            if(movie.getTitle() == title) {
                movie.setTitle(title);
                return movie;
            }
        }
        return null;
    }

    //Idioma en texto plano
    @GetMapping("/test1")
    public String Idiomas(Locale locale) {

        var messages = ResourceBundle.getBundle("i18n\\messages", locale);

        return messages.getString("Main.idioma");
    }


}