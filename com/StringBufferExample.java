package com;

public class StringBufferExample {
public static void main(String[] args)
{
	StringBuffer sb=new StringBuffer("Hello");
	sb.append("Java");
	System.out.println(sb);
	StringBuffer sb1=new StringBuffer("Hello");
	sb1.insert(1,"Java");//Inserts Java in the first location
	System.out.println(sb1);
	StringBuffer sb2=new StringBuffer("Hello");
	sb2.replace(1,3,"Java");//Inserts "Java"in the place of "el" i.e (start index->end index-1)
	System.out.println(sb2);
	StringBuffer sb3=new StringBuffer("Hello");
	sb3.delete(1,3);//Deletes from (index 1 to index 2)
	System.out.println(sb3);
	System.out.println(sb3.reverse());
	StringBuffer sb4=new StringBuffer();  
	System.out.println(sb4.capacity());//default 16  
	sb4.append("Hello");  
	System.out.println(sb4.capacity());//now 16  
	sb4.append("java is my favourite language");  
	System.out.println(sb4.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
	
	
	
	
}
}
