package com;

public class ArrayExceptionDemo {
public static void main(String[] args) {
	try
	{
	int a[]= {1,2,3,4,5};
	System.out.println(a[10]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("doneee");
	}
}
}
