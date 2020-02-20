package com;
class Animal
{
	public void show()
	{
		System.out.println("Im the super class");
	}
}
class Horse extends Animal
{
	public void show()
	{
		System.out.println("I am the sub class");
	}
}
public class Downcasting {
public static void main(String[] args)
{
	Animal a=new Horse();//Upcasting creating reference of the super class and object of subclass
	Horse h=(Horse)a;//For Downcasting the procedure is line no:19,20
	h.show();
	
}
}
