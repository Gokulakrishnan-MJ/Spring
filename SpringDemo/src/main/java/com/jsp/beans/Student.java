package com.jsp.beans;

public class Student {

	private int studentId;
	private String studentName;
	private String Studentdepartment;
	private long studentPhoneNo;
	private String studentEmail;
	private String studentAddress;
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
	public String getStudentdepartment() {
		return Studentdepartment;
	}
	public void setStudentdepartment(String studentdepartment) {
		Studentdepartment = studentdepartment;
	}
	public long getStudentPhoneNo() {
		return studentPhoneNo;
	}
	public void setStudentPhoneNo(long studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Studentdepartment="
				+ Studentdepartment + ", studentPhoneNo=" + studentPhoneNo + ", studentEmail=" + studentEmail
				+ ", studentAddress=" + studentAddress + "]";
	}
	 
	
	
}
