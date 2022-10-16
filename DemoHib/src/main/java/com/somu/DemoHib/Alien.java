package com.somu.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alien_table")
public class Alien {
	
	@Id
	@Column(name = "alien_id")
	private int aid;
	@Column(name = "alien_name")
	private String aName;
	@Column(name = "alien_color")
	private String aColor;
	
	private College clg;
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaColor() {
		return aColor;
	}
	public void setaColor(String aColor) {
		this.aColor = aColor;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aName=" + aName + ", aColor=" + aColor + ", clg=" + clg + "]";
	}
	
	
	
	
}
