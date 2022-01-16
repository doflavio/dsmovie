package io.github.doflavio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.doflavio.dsmovie.entities.Score;
import io.github.doflavio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
