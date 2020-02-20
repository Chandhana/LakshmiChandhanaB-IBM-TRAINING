package com;
import java.io.IOException;
import java.sql.SQLException;//To denote checked 
public class CheckedExample {
	public static void main(String args[])
	
	{ 
	try
	{
		throw new IOException();
		
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
		
	}
	}
	}


