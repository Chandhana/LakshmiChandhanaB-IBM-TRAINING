package com;

public class CharOccurence {
public static void main(String args[])
{
	String s="telecommunication";
	int count=0;
	char c='e';
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==c)
		{
			count++;
		}
	}
	System.out.println("The character"+c+"is present "+count+" times");
}
}
