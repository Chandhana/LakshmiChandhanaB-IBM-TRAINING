package com;
 class Table
 {//Key difference between join and Synchronization is that ,synchronization allows only one thread to be executed at a time whereas  join does multithreading and lets the thread on which join is applied to be completed
	 synchronized void MulTable(int n)
	 {
		 for(int i=1;i<=5;i++)
			  {   
			 System.out.println(n*i);
		 }
		 try
		 {
			 Thread.sleep(100);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
 }
 class Subclass extends Thread
 {  Table t;
	 Subclass(Table t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.MulTable(2);
	 }
	 
 }
 class Secondsubclass extends Thread
 {
	// int a;//cannot use integer variable or integer wrapper class for accessing a method in class Table
	 Table t;
	 Secondsubclass(Table t)
	 {
		 this.t=t;
	 }
	 public void run() {
		 t.MulTable(9);
	 }
 }
public class SynchronizedMethodDemo {

	public static void main(String[] args) {
	
     Table obj =new Table();
     Subclass  t1=new Subclass(obj);//object of the class in which the method has to be called id passed as an argument
     Secondsubclass t2=new Secondsubclass(obj);
     t1.start();
     t2.start();
	}

}
