package com;

public class Box1 {
	int l,w,h;
	static String BoxCompany="ABC";
	static int count=0;
	
	Box1()
	{
		this.l=10;
		this. w=10;
		this. h=20;
		count++;
			}
	Box1(int l,int w,int h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
		count++;
	}
   public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	void volumecalc(int l,int w,int h)
	{
		int vol=l*w*h;
		System.out.println("function calculation "+vol);
	}
void show()
{
	System.out.println("Volume is "+this.l*this.w*this.h);
}
static void change(String BoxCompany)
{
	
	Box1.BoxCompany=BoxCompany;
	System.out.println("BoxCompany  changed  "+BoxCompany);
}
public static void main(String args[])
   {
	Box1 b=new Box1();
	b.show();
	Box1 b2=new Box1(10,20,30);
	Box1 b3=new Box1();
	Box1 b4=new Box1();
	b3.volumecalc(1, 2, 3);
	//b.setH(10);
	//b.getH();
	//b.setL(10);
	//b.getL();
	//b.setW(30);
	//b.getW();
	//b.show();
	b2.show();
	Box1.change("IBM");
	
	System.out.println(Box1.count);
	  
   }
}
