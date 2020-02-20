package com;

public class StaticNestedClassDemo {
	static int data=100;
	static class Inner
	{
		void msg()
		{
			System.out.println(data);
		}
		
	}
	public static void main(String args[])
	{
		StaticNestedClassDemo.Inner inobj=new StaticNestedClassDemo.Inner();
		inobj.msg();
	}

}
