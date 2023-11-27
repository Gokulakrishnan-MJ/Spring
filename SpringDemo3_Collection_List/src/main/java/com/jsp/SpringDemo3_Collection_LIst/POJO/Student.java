package com.jsp.SpringDemo3_Collection_LIst.POJO;

import java.util.List;
import java.util.Set;

public class Student {
	
	private int studentId;
	private String studentName;
	private String Department;
	private String Address;
	private List listofSubjects;
	private Set marks;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public List getListofSubjects() {
		return listofSubjects;
	}
	public void setListofSubjects(List listofSubjects) {
		this.listofSubjects = listofSubjects;
	}
	public Set getMarks() {
		return marks;
	}
	public void setMarks(Set marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return " Student studentId = " + studentId + "\n studentName=" + studentName + "\n Department=" + Department
				+ "\n Address=" + Address + "\n listofSubjects=" + listofSubjects + "\n marks=" + marks;
	}

	

	
	

}
