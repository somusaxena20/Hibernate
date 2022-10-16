package com.somu.hql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private Integer id;
	private Integer deptNo;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer id, Integer deptNo) {
		super();
		this.id = id;
		this.deptNo = deptNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", deptNo=" + deptNo + "]";
	}

}
