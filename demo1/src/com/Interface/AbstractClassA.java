package com.Interface;
 abstract class Hello
{
	public abstract void m1();
	public void show()
	{
		System.out.println("Hello how are you");
	}
		
	}
	

public class AbstractClassA  extends Hello{

	@Override
	public void m1() {

		System.out.println("hi this is the implemention of abstract class");
	}
	public void show()
	{
		System.out.println("override the Hello class method");
	}
	public static void main(String[] args) {
		
	
	AbstractClassA aa=new AbstractClassA();
	aa.m1();
	aa.show();
	}
}
