package com.cisc181.core;
import java.io.*;
public class PersonException extends Exception {
	
	private Person p;
	
	public PersonException(Person p){			
		this.p=p;	
	}
	
	

}

