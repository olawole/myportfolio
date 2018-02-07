package com.olawole.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="skill_name")
	private String skillName;
	
	@Column(name="proficiency")
	private double proficiency;

	public Skill(String skillName, double proficiency) {
		this.skillName = skillName;
		this.proficiency = proficiency;
	}

	public Skill() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public double getProficiency() {
		return proficiency;
	}

	public void setProficiency(double proficiency) {
		this.proficiency = proficiency;
	}
	
	
	
	
	
	

}
