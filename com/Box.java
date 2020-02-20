package com;

public class Box {
int l,w,h;
Box()
{
	System.out.println("Box()");
}
Box(int l)
{  this();
	System.out.println("Box(l)");
	this.l=l;
}
Box(int l,int w)
{   this(l);
	System.out.println("Box(l,w)");
	
}
Box(int l,int w,int h)
{
	this(l,w);
	System.out.println("Box(l,w,h)");
	this.l=l;
	this.w=w;
	this.h=h;
	System.out.println(l);
	System.out.println(w);
	System.out.println(h);
	
}
void Data()
{
	System.out.println(this.l);
	System.out.println(this.w);
	System.out.println(this.h);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Box b=new Box();
     b.Data();
     Box b2=new Box(10);
     b2.Data();
     Box b3=new Box(10,20);
     b3.Data();
     Box b4=new Box(10,20,10);
     //b4.Data();
	}

}
