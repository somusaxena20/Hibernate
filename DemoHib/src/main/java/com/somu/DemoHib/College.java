package com.somu.DemoHib;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class College {
	
	@Column(name = "college_name")
	private String name;
	@Column(name = "college_city")
	private String city;
	@Column(name = "college_tier")
	private String tier;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + ", tier=" + tier + "]";
	}
	
	
}
