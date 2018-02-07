package com.olawole.portfolio.web.dto;

import com.olawole.portfolio.entities.Skill;

public class SkillDto {
	
	private String skillName;
	
	private double proficiency;

	public SkillDto(String skillName, double proficiency) {
		this.skillName = skillName;
		this.proficiency = proficiency;
	}
	
	public SkillDto(Skill skill) {
		this.skillName = skill.getSkillName();
		this.proficiency = skill.getProficiency();
	}

	public SkillDto() {
		
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
