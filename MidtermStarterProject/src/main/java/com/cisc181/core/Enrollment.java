package com.cisc181.core;
import java.util.UUID;



public class Enrollment {
	
	private UUID SectionID; 
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){	
	}
	
	Enrollment(UUID StudentID, UUID SectionId){
		this.StudentID = StudentID;
		this.SectionID = SectionId;
		this.EnrollmentID = UUID.randomUUID();
		
			
	}
	
	public void setGrade(double Grade){
		this.Grade = Grade; 
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}
	
	
	
	

}
