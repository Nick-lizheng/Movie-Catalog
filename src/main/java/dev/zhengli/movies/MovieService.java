package dev.zhengli.movies;

import jakarta.annotation.Resource;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    @Resource
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> singleMovieByImdb(String imdbID) {
        return movieRepository.findMovieByimdbId(imdbID);
    }

}
