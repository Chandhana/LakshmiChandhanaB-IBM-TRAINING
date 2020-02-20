package com;

public class ThrowDemo {
static void validate(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("cannot vote");
		
	}
	else
	{
		System.out.println("Welcome to vote");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);

	}

}
