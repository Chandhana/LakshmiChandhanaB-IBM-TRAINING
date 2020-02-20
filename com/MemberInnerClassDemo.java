package com;
class Outer
{ private int data=12;
	class Inner
	{
		void show()
		{
			System.out.println(data);
		}
	}
}

public class MemberInnerClassDemo {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Outer out=new Outer();
  Outer.Inner in=out.new Inner();
   in.show();
	}

}
