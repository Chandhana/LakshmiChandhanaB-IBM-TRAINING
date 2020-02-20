package com;
import java.util.*;
public class HashSetDemo {
public static void main(String[]args)
{
	HashSet<String>set=new HashSet<String>();
	set.add("Lakshmi");
	set.add("chandhana");
	//System.out.println(set);
	Iterator<String>itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
