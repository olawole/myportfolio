package com.olawole.portfolio.repositories.homepage;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.olawole.portfolio.entities.AboutMe;

public interface AboutRepository extends CrudRepository<AboutMe, Integer> {
	
	Optional<AboutMe> findById(Integer id);

}
