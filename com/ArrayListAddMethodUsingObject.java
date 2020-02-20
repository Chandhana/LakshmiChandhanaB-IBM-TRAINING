package com;
import java.util.*;
class Students
{
	String name;
	int age;
	int rollno;
	Students(int rollno,int age,String name)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}
public class ArrayListAddMethodUsingObject {
 public static void main(String[]args)
 
 {ArrayList<Students> arr=new ArrayList<Students>();
	 Students s1=new Students(100,19,"abc");
	 Students s2=new Students(200,20,"sdc");
	 
	 
	 arr.add(s1);
	 arr.add(s2);
	 Iterator <Students>itr=arr.iterator();
	 while(itr.hasNext())
	 {
		 Students st=itr.next();
		 System.out.println(st.rollno+" "+st.age+" "+st.name);
		// System.out.println(itr.next());
	 }
	 
 }
}
