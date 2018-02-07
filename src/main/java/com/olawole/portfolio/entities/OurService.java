package com.olawole.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="services")
public class OurService {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="service_id")
	private int id;
	
	@Column(name="service_name")
	private String serviceName;
	
	@Column(name="description")
	private String description;

	public OurService() {
	}

	public OurService(String serviceName, String description) {
		this.serviceName = serviceName;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
