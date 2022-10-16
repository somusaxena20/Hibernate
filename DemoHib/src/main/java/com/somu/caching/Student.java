package com.somu.caching;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name = "emp_student_table")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	private int sId;
	private String sName;
	private String sCity;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, String sCity) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
	}

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

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + "]";
	}

}
