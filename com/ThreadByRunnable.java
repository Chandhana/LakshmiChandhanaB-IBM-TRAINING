package com;
class A
{
	void show()
	{
		System.out.println("super");
	}
	
}
public class ThreadByRunnable extends A implements Runnable {
	@Override
	public void run() {
	          for(int i=0;i<=10;i++)
	          {
	        	  System.out.println(i);
	          }
		
	}
	public static void main(String[] args)
	{
		ThreadByRunnable runobj=new ThreadByRunnable();
		Thread t=new Thread(runobj);//runnable target
		t.start();
	}
	
}
