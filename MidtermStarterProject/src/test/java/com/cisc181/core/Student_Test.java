package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;
import junit.framework.TestCase;

public class Student_Test extends TestCase {

	@Test
	public void test() {
		
		//Creating array lists
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Section> sections = new ArrayList<Section>();
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		ArrayList<Student> students = new ArrayList<Student>();
		
		
		//Creating courses and adding them to list
		Course mathCourse = new Course(UUID.randomUUID(),"Math",100);
		Course englishCourse = new Course(UUID.randomUUID(),"English",100);
		Course historyCourse = new Course(UUID.randomUUID(),"History",100);
		
		courses.add(mathCourse);
		courses.add(englishCourse);
		courses.add(historyCourse);
		
		//creating semesters and adding them to list
		Semester fall = new Semester(UUID.randomUUID(), new Date(), new Date());
		Semester spring = new Semester(UUID.randomUUID(), new Date(), new Date());
		
		semesters.add(fall);
		semesters.add(spring);
		
		//creating sections and adding them to list
		Section a = new Section();
		Section b = new Section();
		Section c = new Section();
		Section d = new Section();
		Section e = new Section();
		Section f = new Section();
		
		sections.add(a);
		sections.add(b);
		sections.add(c);
		sections.add(d);
		sections.add(e);
		sections.add(f);
		
		
		//Creating students and adding them to array list
		Student s1 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s2 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s3 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s4 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s5 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s6 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s7 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s8 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s9 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		Student s10 = new Student("Student", "S","Examplson" , new Date(), eMajor.COMPSI, "Example Lane","(123)-456-7890", "exampl@dress.com",UUID.randomUUID());
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		
	
		//Creating sections for enrollments with each having 10 students
		ArrayList<Enrollment> enrollmentsSECA = new ArrayList<Enrollment>();
		ArrayList<Enrollment> enrollmentsSECB = new ArrayList<Enrollment>();
		ArrayList<Enrollment> enrollmentsSECC = new ArrayList<Enrollment>();
		ArrayList<Enrollment> enrollmentsSECD = new ArrayList<Enrollment>();
		ArrayList<Enrollment> enrollmentsSECE = new ArrayList<Enrollment>();
		ArrayList<Enrollment> enrollmentsSECF = new ArrayList<Enrollment>();
		
		
		// I made the studentID an attribute of the student class because
		// I was unsure of how else to use the students I have already created
		// for the enrollment class. So I am enrolling them using their student
		// id's
		//Using 6 for loops to add 10 students to each section arraylist
		for(Student s: students){
			
			enrollmentsSECA.add(new Enrollment(s.getId(), a.getSectionId()));		
		}	
		
		for(Student s: students){
			
			enrollmentsSECB.add(new Enrollment(s.getId(), b.getSectionId()));				
	    }
		
		for(Student s: students){
			
			enrollmentsSECC.add(new Enrollment(s.getId(), c.getSectionId()));				
		}
		
		for(Student s: students){
			
			enrollmentsSECD.add(new Enrollment(s.getId(), d.getSectionId()));				
		}
		
		for(Student s: students){
			
			enrollmentsSECE.add(new Enrollment(s.getId(), e.getSectionId()));				
		}
		
		for(Student s: students){
			
			enrollmentsSECF.add(new Enrollment(s.getId(), f.getSectionId()));				
		}
		
		
		//Setting the grades for all the students
		for(Enrollment enr: enrollmentsSECA){
			enr.setGrade(0);
		}
		
		for(Enrollment enr: enrollmentsSECB){
			enr.setGrade(20);
		}
		
		for(Enrollment enr: enrollmentsSECC){
			enr.setGrade(40);
		}
		
		for(Enrollment enr: enrollmentsSECD){
			enr.setGrade(60);
		}
		
		for(Enrollment enr: enrollmentsSECE){
			enr.setGrade(80);
		}
		
		for(Enrollment enr: enrollmentsSECF){
			enr.setGrade(100);
		}
		
		int sumSECA = 0;
		int sumSECB = 0;
		int sumSECC = 0;
		int sumSECD = 0;
		int sumSECE = 0;
		int sumSECF = 0;
		
		/**
		 * 
		 * I was sort of unsure of the directions at this part so I am going to assume
		 * sections A and B are for the same course
		 * sections C and D are for the same course
		 * and sections E and F are for the same course
		 * 
		 * and then find the grade averages within those courses
		 * 
		 *
		 * 
		 * */
		
		for(Enrollment enr: enrollmentsSECA){
			sumSECA += enr.getGrade();
		}
		
		for(Enrollment enr: enrollmentsSECB){
			sumSECB += enr.getGrade();
		}
		double averageAB = (sumSECA+sumSECB)/20;
		
		for(Enrollment enr: enrollmentsSECC){
			sumSECC += enr.getGrade();
		}
		
		for(Enrollment enr: enrollmentsSECD){
			sumSECD += enr.getGrade();
		}
		double averageCD = (sumSECC+sumSECD)/20;
		
		for(Enrollment enr: enrollmentsSECE){
			sumSECE += enr.getGrade();
		}
		
		for(Enrollment enr: enrollmentsSECF){
			sumSECF += enr.getGrade();
		}
		double averageEF = (sumSECE+sumSECF)/20;
		
		assertEquals(averageAB, 10.0);
		assertEquals(averageCD, 50.0);
		assertEquals(averageEF, 90.0);
		
		
		System.out.println(s1.getMajor());
		s1.setMajor(eMajor.CHEM);
		System.out.println(s1.getMajor());
		
		
		
		
	}
}