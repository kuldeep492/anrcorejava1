package com.constructor1;

public class Employee {
	
	public  Employee()
	{
		
		System.out.println("0-arg const");
		
	}
	public  Employee(int a)
	{
		this();
		System.out.println("1-arg const");
	}
	public Employee(int a,int b)
	{
		this(10);
		System.out.println("2-arg const");
	}
	
	
}
