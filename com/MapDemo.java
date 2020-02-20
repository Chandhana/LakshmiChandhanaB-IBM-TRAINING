package com;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> m=new HashMap<Integer,String>();
m.put(1,"a");
m.put(2, "b");
Set s=m.entrySet();
Iterator<MapDemo>itr=s.iterator();//only set extends Iterator and not map so we have to convert it inorder to use iterator
while(itr.hasNext())
{
	//System.out.println(itr.next());//this will give only the set but if u need map convert it
	Map.Entry  entry=(Map.Entry)itr.next();
	System.out.println(entry.getKey()+" "+entry.getValue());
}

	}

}
