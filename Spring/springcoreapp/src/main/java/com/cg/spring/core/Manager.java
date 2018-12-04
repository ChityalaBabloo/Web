package com.cg.spring.core;

public class Manager {

	private int deptno;
	private String ProjectName;
	private int ProjectCode;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public int getProjectCode() {
		return ProjectCode;
	}
	public void setProjectCode(int projectCode) {
		ProjectCode = projectCode;
	}
	
	@Override
	public String toString() {
		return "Manager [deptno=" + deptno + ", ProjectName=" + ProjectName + ", ProjectCode=" + ProjectCode + "]";
	}
	
	
	
}
