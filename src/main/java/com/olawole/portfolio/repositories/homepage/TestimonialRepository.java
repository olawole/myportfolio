package com.olawole.portfolio.repositories.homepage;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.olawole.portfolio.entities.Testimonial;

public interface TestimonialRepository extends CrudRepository<Testimonial, Integer> {
	
	List<Testimonial> findAll();

}
