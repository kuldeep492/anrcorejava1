package com.constructor1;

public class Manager extends Employee {

	public Manager()
	{
	//this(10);
		super(5,10);
		System.out.println("0 arg manager const");
		}
	public Manager(int a) {
		this();
		System.out.println("1 arg manager cosnt");
			}

	public Manager(int a, int b) {
	this(10);
System.out.println("2-arg manger const");
}

	public static void main(String[] args) {
			Manager m=new Manager(5,7);
		}

	}


