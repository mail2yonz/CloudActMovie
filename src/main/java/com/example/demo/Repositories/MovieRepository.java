package com.example.demo.Repositories;

import com.example.demo.Entity.Actor;
import com.example.demo.Entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {

    Iterable<Movie> findAllByCastIsIn(Iterable<Actor> actors);
}
