package com.somu.relationMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int sId;
	private String sName;
	private double sMarks;
	@ManyToMany(mappedBy = "student", fetch = FetchType.EAGER)
	private List<Laptop> laptop = new ArrayList<>();

	public Student() {
		super();
		// TODO Auto-generated constructor stub
//		this.laptop = new ArrayList<>();
	}

//	public Student(int sId, String sName, double sMarks, Laptop laptop) {
//		super();
//		this.sId = sId;
//		this.sName = sName;
//		this.sMarks = sMarks;
//		this.laptop = laptop;
//	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getsMarks() {
		return sMarks;
	}

	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}

	

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + ", laptop=" + laptop + "]";
	}

	
	

}
