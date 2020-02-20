package com;

public class StaticMethodExample {
	static int a=12;
	int b;//non static and instance variable
	static 
	{
	a=101;//This value once initialized cannot be replaced
	System.out.println(a);
	//static block is always called  before main method
	System.out.println("static block is always called before main method");
	System.out.println("Static block first");
		
	}
	static void setA()//static keyword is used before method
	{   int c=10;//local variable has to be initilised otherwise it will throw an error
		System.out.println(a);
		System.out.println(c);
	//	System.out.println(b);//NOTE:Cannot access the non instance variable in a static method directly we need to 
		//make an object as shown in line no:26
	}
	
	public static void main(String[] args)
	{
		setA();
		StaticMethodExample k=new StaticMethodExample();
		System.out.println(k.b);
		//System.out.println("Main Next");
	}

}
