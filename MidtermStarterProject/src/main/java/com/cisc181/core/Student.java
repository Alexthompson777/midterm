package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentId;
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email, UUID StudentId) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		
	}
	
	public UUID getId(){
		return StudentId;
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}