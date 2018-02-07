package com.olawole.portfolio.repositories.homepage;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.olawole.portfolio.entities.Education;

public interface EducationRepository extends CrudRepository<Education, Integer> {
	
	List<Education> findAll();

}
