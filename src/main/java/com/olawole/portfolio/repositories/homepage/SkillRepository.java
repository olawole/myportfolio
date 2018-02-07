package com.olawole.portfolio.repositories.homepage;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.olawole.portfolio.entities.Skill;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
	
	List<Skill> findAll();

}
