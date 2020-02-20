package com;

public class Enum {
public enum Days{monday,tuesday,wednesday,thursday,friday,saturday,sunday}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (Days d:Days.values())
{
	System.out.println(d);
}
	System.out.println("Value of thursday is: "+Days.valueOf("thursday"));  
	System.out.println("Index of thurday is: "+Days.valueOf("thursday").ordinal());  

	}

}
