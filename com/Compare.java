package com;

public class Compare {
public static void main(String[] args)
{//== compares references in string literal both the strings have same reference as new obj is not created
	String s1="Sachin";
	String s2="Sachin";//string pool
	String s3=new String("Sachin");//inside heap memory
	String s4="fanta";
;	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s1==s2);//comparing references
	System.out.println(s1==s3);
}
}
