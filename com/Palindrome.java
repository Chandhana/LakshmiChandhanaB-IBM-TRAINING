package com;

public class Palindrome {
public static void main(String args[])
{
	String s="malayalam";
	int l=s.length()-1;
	int i=0;
	int flag=0;
while((l>=0)&&(i<l))
{
	if(s.charAt(i)==s.charAt(l))
	{
		flag=1;
	
	}
	else
	{
	flag=0;	
	}
	l--;
	i++;
}
if(flag==1)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
}
}
