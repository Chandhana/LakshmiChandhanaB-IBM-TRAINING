package com;

public class ExceptionPropogationExample {
	void top()
	{
		int result=50/0;//even if the exception is not handled in this method it can be handled in the method calling this
		
	}
	void belowtop()//calling function i.e its calling top,exception is not handled here also but it can be done in its calling method
	{
		top();
	}
	void belowbelow()//exception is not handled here ,it can be handled in its previous method that is calling this method
	{ try
	{
		belowtop();
	}
	catch (Exception e)
	{
		System.out.println("Exception handled");//if not handled here it can also be handled in main
	}
	}
public static void main(String args[])
{
	ExceptionPropogationExample obj=new ExceptionPropogationExample();
	//try->this is how it is handled at main,if not handled even here then exception occurs
	//{
	obj.belowbelow();
//}
	//catch
	//{
	//}
}
}
