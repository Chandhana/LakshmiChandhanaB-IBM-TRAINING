package com;

public class objectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob[]=new Account[2];
		ob[0]=new Account();
		ob[1]=new Account();
		ob[0].setData(10,2);
		
		ob[1].setData(3, 4);
		ob[0].showData();
		ob[1].showData();

	}

}
class Account
{
	int a,b;
	public void setData(int c,int d)
	{
		a=c;
		b=d;
	}
	public void showData() {
		System.out.println(a);
		System.out.println(b);
	}
}