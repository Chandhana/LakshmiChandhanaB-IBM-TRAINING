package com;

public class ImmutableExample {
public static void main(String[]args)
{
	String a="apple";
	a.concat("fruit");
	System.out.println(a);//does not concat as the object a is not given in lhs i.e in this fashion -> a=a.concat("fruit")
}
}
