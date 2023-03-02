package com.entity;


public class Department {

	
	public Department(){
		
	}
	
	public Long getDeptId() {
		return DeptId;
	}
	public void setDeptId(Long deptId) {
		DeptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	public Department(Long deptId, String deptName, String deptAddress, String deptCode) {
		super();
		DeptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.deptCode = deptCode;
	}
	
	private Long DeptId;
	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + ", deptName=" + deptName + ", deptAddress=" + deptAddress
				+ ", deptCode=" + deptCode + "]";
	}

	private String deptName;
	private String deptAddress;
	private String deptCode;
	
}
