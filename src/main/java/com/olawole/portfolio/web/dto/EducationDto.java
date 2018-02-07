package com.olawole.portfolio.web.dto;

import javax.validation.constraints.NotNull;

import com.olawole.portfolio.entities.Education;

public class EducationDto {
	
	@NotNull
	private String school;
	
	@NotNull
	private String startYear;
	
	@NotNull
	private String endYear;
	@NotNull
	private String course;

	public EducationDto(String school, String startYear, String endYear, String course) {
		this.school = school;
		this.startYear = startYear;
		this.endYear = endYear;
		this.course = course;
	}
	
	public EducationDto(Education education) {
		this.school = education.getSchool();
		this.startYear = education.getStartYear();
		this.endYear = education.getEndYear();
		this.course = education.getCourse();
	}

	public EducationDto() {
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	

}
