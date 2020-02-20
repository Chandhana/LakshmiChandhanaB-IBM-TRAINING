package com;

public class varargs {
static void display(int... values)
{
	System.out.println("display method invoked");
	int sum=0;
	for(int i:values)
	{
		sum=sum+i;
		
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       display(1,2,4,5,6);
	}

}
