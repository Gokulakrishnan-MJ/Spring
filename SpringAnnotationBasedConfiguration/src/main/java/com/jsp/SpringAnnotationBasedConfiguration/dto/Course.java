package com.jsp.SpringAnnotationBasedConfiguration.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value(value="011")
	private int courseId;
	@Value(value="Core Java")
	private String courseName;
	@Value(value="Trainer 1")
	private String trainerName;
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName + "]";
	}
	
	

}
