package com;
//Displays compile time error if the method is not present properly in the subclass
//Because in method overriding subclass is trying to override the superclass method so if any spelling mistake is made in 
//subclass method it is notified using compile time error

class Fruits
{
	public void display()
	{
		System.out.println("Fruit here");
	}
}
class Apples extends Fruits
{  @Override
	public void display()
	{    
		System.out.println("Apples here");
	}
}
public class OverridingExample {
	public static void main(String[] args) {
		Apples a=new Apples();
		a.display();
	}

}
