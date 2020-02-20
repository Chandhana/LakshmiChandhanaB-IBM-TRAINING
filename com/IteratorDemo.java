package com;
import java.util.*;
public class IteratorDemo {
public static void main(String[] args)
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("hi");
	list.add("hello");
	list.add("How are you?");
	Iterator<String>itr=list.iterator();//now elements of list go into the iterator
	while(itr.hasNext())//until the next elements are present keep traversing
	{
		System.out.println(itr.next());
	}
}
}
