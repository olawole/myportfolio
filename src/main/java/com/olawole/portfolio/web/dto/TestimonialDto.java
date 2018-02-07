package com.olawole.portfolio.web.dto;

import com.olawole.portfolio.entities.Testimonial;

public class TestimonialDto {

	private String testifierName;

	private String company;

	private String testimony;

	private String thumbnail;

	public TestimonialDto(String testifierName, String company, String testimony, String thumbnail) {
		this.testifierName = testifierName;
		this.company = company;
		this.testimony = testimony;
		this.thumbnail = thumbnail;
	}
	
	public TestimonialDto(Testimonial testimonial) {
		this.testifierName = testimonial.getTestifierName();
		this.company = testimonial.getCompany();
		this.testimony = testimonial.getTestimony();
		this.thumbnail = testimonial.getThumbnail();
	}

	public TestimonialDto() {
	}

	public String getTestifierName() {
		return testifierName;
	}

	public void setTestifierName(String testifierName) {
		this.testifierName = testifierName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTestimony() {
		return testimony;
	}

	public void setTestimony(String testimony) {
		this.testimony = testimony;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
