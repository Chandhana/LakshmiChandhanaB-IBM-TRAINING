package com;

public class ExceptionExample {
  public static void main(String[] args)
  { int a=10;
	  System.out.println("Execution begins");
	  try
	  {
	  System.out.println(a/10);
	 
	  }
	 catch (Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	  finally
	  {
		  System.out.println("finally is executed irrespective of Exception");
	  }
	  
	  //System.out.println("Done Bro");
  
  }
}
