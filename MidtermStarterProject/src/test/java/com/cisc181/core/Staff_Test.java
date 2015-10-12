package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
import junit.framework.TestCase;

public class Staff_Test extends TestCase {

	@Test
	public void test() throws PersonException {
		
		//Array list of staff members
		ArrayList<Staff> members = new ArrayList<Staff>();
		
		
		Staff a = new Staff("John", "J", "Johnson", new Date(), "Street", "(123)-456-7890", "email@address", "Appointment", 1, 50000, new Date(), eTitle.PROFESSOR);
		Staff b = new Staff("John", "J", "Johnson", new Date(), "Street", "(123)-456-7890", "email@address", "Appointment", 1, 60000, new Date(), eTitle.PROFESSOR);
		Staff c = new Staff("John", "J", "Johnson", new Date(), "Street", "(123)-456-7890", "email@address", "Appointment", 1, 70000, new Date(), eTitle.PROFESSOR);
		Staff d = new Staff("John", "J", "Johnson", new Date(), "Street", "(123)-456-7890", "email@address", "Appointment", 1, 80000, new Date(), eTitle.PROFESSOR);
		Staff e = new Staff("John", "J", "Johnson", new Date(), "Street", "(123)-456-7890", "email@address", "Appointment", 1, 90000, new Date(), eTitle.PROFESSOR);
		
		members.add(a);
		members.add(b);
		members.add(c);
		members.add(d);
		members.add(e);
		
		//Calculating average salary
		int sum = 0;
		for(Staff s:members){
			sum += s.getSalary();
		}
		
		double average = sum/5;
		
		//Testing average salary
		assertEquals(average, 70000.0);
		
	
		//Exception Test
		@SuppressWarnings("deprecation")
		Staff x = new Staff("John", "J", "Johnson", new Date(1900,1,2), "Street", "(123)-456-7890", "email@address", "Appointment", 1, 90000, new Date(), eTitle.PROFESSOR);
	}
	
	
}
	


