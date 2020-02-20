package com;
import java.util.*;
public class MapWithoutIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("Lakshmi",1999);
		m.put("Chandhana",29);
		for(Map.Entry m1:m.entrySet())
		{
			System.out.println(m1.getKey()+""+m1.getValue());
		}
		}

}
