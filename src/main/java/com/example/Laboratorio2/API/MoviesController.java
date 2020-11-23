package com.example.Laboratorio2.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import com.example.Laboratorio2.Model.Movie;

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
    public static ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(
        new Movie(1, 1997, "Avatar","https://m.media-amazon.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg","A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home." ),
        new Movie(2, 1994, "Forrest Gump","https://m.media-amazon.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg","The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate and other historical events unfold through the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart."),
        new Movie(3, 2000, "Gladiator", "https://m.media-amazon.com/images/M/MV5BMDliMmNhNDEtODUyOS00MjNlLTgxODEtN2U3NzIxMGVkZTA1L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg", "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery."),
        new Movie(4, 2001, "Borat", "https://m.media-amazon.com/images/M/MV5BMTk0MTQ3NDQ4Ml5BMl5BanBnXkFtZTcwOTQ3OTQzMw@@._V1_SX300.jpg","Kazakh TV talking head Borat is dispatched to the United States to report on the greatest country in the world. With a documentary crew in tow, Borat becomes more interested in locating and marrying Pamela Anderson."),
        new Movie(5, 1990, "Joker", "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg", "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.")

    ));
    // Obtengo todas las peliculas
    @GetMapping("/peliculas")
     public List<Movie> getAll(){

        return movies;
    }

     
    // Obtengo peliculas por titulo
    @GetMapping("/peliculas/titulo/{title}")
    public static Movie ObtenerPorTitulo(@PathVariable("title") String title){
        for(Movie movie : movies){
            if (movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }

    // Obtengo peliculas por año
    @GetMapping("peliculas/año/{year}")
    public static Movie ObtenerPorAño(@PathVariable("year") int year){
        for(Movie movie : movies){
            if (movie.getYear() == year) {
                return movie;
            }
        }
        return null;
    }


    // Crear una pelicula
    @PostMapping("/movie")
    public static Movie createMovie(@RequestBody Movie newMovie){
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
    public static Movie deleteMovie(@PathVariable("title") String title ){
        for (Movie movie : movies){
            if(movie.getTitle() == title) {
                movies.remove(movie);
                return null;
            }
        }
        return null;
    }


    // Metodo findbyid
    public static Movie findById(int id){
        for(Movie movie : movies){
            if(movie.getId() == id){
                return movie;
            }
        }
        return null;
    }

    // Llamo al metodo findbyid
    @GetMapping("/moviess/{id}")
    public Movie MovieById(@PathVariable("id")int id){
        return  findById(id);

    }


    //Modificar una Pelicula
    @PutMapping("/movie/modify/{title}")
    public  static Movie modifyMovie(@RequestBody Movie nameTitle, @PathVariable("title") String title){
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