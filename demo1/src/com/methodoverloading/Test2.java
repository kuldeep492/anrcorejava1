package com.methodoverloading;
class ChangeArgument
{
	public static int sum(int a,int b)
	
	{
	return a+b;
		/*int add=a+b;
		System.out.println(add);*/
	}
	public  static float sum(int a,float b,int c)
	{
		return a*b+c;
		/*int add=a+b+c;
		System.out.println(add);*/
	}
	public  String sum(String a)
	{
		return a;
	}
}

//method overriding


class Hello extends ChangeArgument
{
	public   String sum(String a)
	{
		super.sum(a);
		return a;
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ChangeArgument.sum(10,20 ));
		System.out.println(ChangeArgument.sum(10, 20.45f, 30));
		//System.out.println(ChangeArgument.sum("hello how are u"));
		Hello h=new Hello();
		System.out.println(h.sum("hiiii"));
		System.out.println();
		
		
	}

}
