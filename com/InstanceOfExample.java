package com;
class Animals
{
	public void show()
	{
		System.out.println("I am an animal superclass");
	}
}
class Dog extends Animals
{
	public void show()
	{
		System.out.println("I am a Dog in subclass");
	}
}
class Cat extends Animals
{
	public void show()
	{
		System.out.println("I am a Cat in subclass");
	}
}

public class InstanceOfExample {
	//Used to check if that instance belongs to that class returns true or false
public static void main(String[] args)
{
	Animals a= new Animals();
	System.out.println(a instanceof Animals);
	Dog d=new Dog();
	System.out.println(d instanceof Dog);
	System.out.println(d instanceof Animals);
	Cat c=null;
	System.out.println(c instanceof Cat);
	System.out.println(c instanceof Animals);
	
}
}
