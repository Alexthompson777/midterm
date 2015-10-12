package com.cisc181.core;
import java.util.UUID;

public class Section {
	
	private UUID CourseId;
	private UUID SemesterId;
	private UUID SectionId;
	private int RoomId;
	
	public Section(){
		
	}
	
	public UUID getCourseId() {
		return CourseId;
	}
	public void setCourseId(UUID courseId) {
		CourseId = courseId;
	}
	public UUID getSemesterId() {
		return SemesterId;
	}
	public void setSemesterId(UUID semesterId) {
		SemesterId = semesterId;
	}
	public UUID getSectionId() {
		return SectionId;
	}
	public void setSectionId(UUID sectionId) {
		SectionId = sectionId;
	}
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}

}
