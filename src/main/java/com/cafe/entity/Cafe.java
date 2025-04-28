package com.cafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cafe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cafeId;
	private String name;
	private String description;
	private String availability;

	private String location;
	
	public Long getCafeId() {
		return cafeId;
	}
	public void setCafeId(Long cafeId) {
		this.cafeId = cafeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", name=" + name + ", description=" + description + ", availability="
				+ availability + ", location=" + location + "]";
	}
	
	
}
