package com.olawole.portfolio.repositories.homepage;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.olawole.portfolio.entities.OurService;

public interface OurServiceRepository extends CrudRepository<OurService, Integer> {
	
	List<OurService> findAll();

}
