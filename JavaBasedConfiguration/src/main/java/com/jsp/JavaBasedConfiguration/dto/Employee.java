package com.jsp.JavaBasedConfiguration.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

 
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private int employeeSal;
	
	
	public int getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(int employeeSal) {
		this.employeeSal = employeeSal;
	}
	@Autowired
	private Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSal=" + employeeSal + ", dept=" + dept + "]";
	}
	

}
