package com.olawole.portfolio.web.dto;

import javax.validation.constraints.NotNull;

import com.olawole.portfolio.entities.AboutMe;

public class AboutMeDto {

	@NotNull
	private String introText;

	@NotNull
	private String profilePix;

	public AboutMeDto() {
	}

	public AboutMeDto(String introText, String profilePix) {
		this.introText = introText;
		this.profilePix = profilePix;
	}

	public AboutMeDto(AboutMe aboutMe) {
		this.introText = aboutMe.getIntroText();
		this.profilePix = aboutMe.getProfilePix();
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

}
