package dev.zhengli.movies;

import jakarta.annotation.Resource;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Resource
    private MovieService movieService;
//    @Resource
//    private HttpSession httpSession;


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);

    }



    @GetMapping("/test/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
        return new ResponseEntity<>(movieService.singleMovie(id), HttpStatus.OK);
    }


    @GetMapping("/{imdbID}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByImdb(@PathVariable String imdbID){
        return new ResponseEntity<>(movieService.singleMovieByImdb(imdbID), HttpStatus.OK);
    }


}
