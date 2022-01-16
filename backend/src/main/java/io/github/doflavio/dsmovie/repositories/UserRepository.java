package io.github.doflavio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.doflavio.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
