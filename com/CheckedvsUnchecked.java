package com;

public class CheckedvsUnchecked {
	public static void main(String args[])
	{
throw new IOException();//compile time ->checked Exception
throw new ArrayIndexOutOfBoundsException();//Runtime exception->Exception is thrown after you run
	}
}
