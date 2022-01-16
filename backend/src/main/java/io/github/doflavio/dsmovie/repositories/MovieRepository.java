package io.github.doflavio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.doflavio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
