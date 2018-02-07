package com.olawole.portfolio.web.dto;

import javax.validation.constraints.NotNull;

import com.olawole.portfolio.entities.OurService;

public class OurServiceDto {
	@NotNull
	private String serviceName;
	@NotNull
	private String description;

	public OurServiceDto() {
	}

	public OurServiceDto(String serviceName, String description) {
		this.serviceName = serviceName;
		this.description = description;
	}
	
	public OurServiceDto(OurService ourService) {
		this.serviceName = ourService.getServiceName();
		this.description = ourService.getDescription();
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
