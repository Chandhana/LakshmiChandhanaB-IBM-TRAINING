package com;

public class WrapperClass {
public static void main(String[] args)
{
	int a=78;//primitive
	Integer in =new Integer(100);
	System.out.println(in.byteValue());//can call a method since in is object
	System.out.println(a);
	in=a;//autoboxing,primitive variable a is being assigned into wrapper class objective
	System.out.println(in +"Autoboxing");
	int b;
	b=in;//unboxing,wrapper class instance is being assigned converted into primitive
	System.out.println(b+" Unboxing");
	
}
}
