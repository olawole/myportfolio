package com.olawole.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testimonial")
public class Testimonial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "testifier_name")
	private String testifierName;

	@Column(name = "affiliation")
	private String company;

	@Column(name = "testimony")
	private String testimony;

	@Column(name = "thumbnail")
	private String thumbnail;

	public Testimonial(String testifierName, String company, String testimony, String thumbnail) {
		this.testifierName = testifierName;
		this.company = company;
		this.testimony = testimony;
		this.thumbnail = thumbnail;
	}

	public Testimonial() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
