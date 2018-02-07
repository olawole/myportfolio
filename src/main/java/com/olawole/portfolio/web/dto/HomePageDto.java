package com.olawole.portfolio.web.dto;

import java.util.List;

public class HomePageDto {
	
	private AboutMeDto aboutSection;
	
	private List<EducationDto> education;
	
	private List<OurServiceDto> services;
	
	private List<SkillDto> skills;
	
	private List<TestimonialDto> testimonials;
	
	

	public HomePageDto() {
		
	}

	public HomePageDto(AboutMeDto aboutSection, List<EducationDto> education, List<OurServiceDto> services,
			List<SkillDto> skills, List<TestimonialDto> testimonials) {
		this.aboutSection = aboutSection;
		this.education = education;
		this.services = services;
		this.skills = skills;
		this.testimonials = testimonials;
	}

	public AboutMeDto getAboutSection() {
		return aboutSection;
	}

	public void setAboutSection(AboutMeDto aboutSection) {
		this.aboutSection = aboutSection;
	}

	public List<EducationDto> getEducation() {
		return education;
	}

	public void setEducation(List<EducationDto> education) {
		this.education = education;
	}

	public List<OurServiceDto> getServices() {
		return services;
	}

	public void setServices(List<OurServiceDto> services) {
		this.services = services;
	}

	public List<SkillDto> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillDto> skills) {
		this.skills = skills;
	}

	public List<TestimonialDto> getTestimonials() {
		return testimonials;
	}

	public void setTestimonials(List<TestimonialDto> testimonials) {
		this.testimonials = testimonials;
	}
	
	
}
