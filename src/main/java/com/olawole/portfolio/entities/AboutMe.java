package com.olawole.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="about")
public class AboutMe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="text")
	private String introText;
	
	@Column(name="profile_pix")
	private String profilePix;
	
	public AboutMe() {
	}
	public AboutMe(String introText, String profilePix) {
		this.introText = introText;
		this.profilePix = profilePix;
	}
	public String getIntroText() {
		return introText;
	}
	public void setIntroText(String introText) {
		this.introText = introText;
	}
	public String getProfilePix() {
		return profilePix;
	}
	public void setProfilePix(String profilePix) {
		this.profilePix = profilePix;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
