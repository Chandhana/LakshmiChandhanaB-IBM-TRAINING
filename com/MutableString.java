package com;

public class MutableString {

	public static void main(String[] args)
	{
	String s="hi";
	s=s.concat("Hello");//if the object s i given in LHS also then it will get concatenated
	System.out.println(s);

	}

}
