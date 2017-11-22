package com.example.demo.Repositories;

import com.example.demo.Entity.Actor;
import com.example.demo.Entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {

//    Iterable <Actor> findAllByRealnameContainingIgnorCase(String s);
    Iterable<Actor> findAllByRealnameContaining(String s);

    Iterable <Actor> findAllByMoviesNotContaining(Movie thisMovie);

}
