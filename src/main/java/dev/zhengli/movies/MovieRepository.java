package dev.zhengli.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//tesing for new proxy for windows
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
