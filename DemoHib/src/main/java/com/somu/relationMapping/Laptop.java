package com.somu.relationMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lId;
	private String lName;
	@ManyToMany
	private List<Student> student = new ArrayList<>();

	public Laptop(int lId, String lName) {
		super();
		this.lId = lId;
		this.lName = lName;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + ", student=" + student + "]";
	}

	

}
