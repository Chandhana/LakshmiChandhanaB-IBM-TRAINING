package com;
import java.util.*;
public class CollectionDemo {
public static void main(String  args[])
{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(10);
	arr.add(11);
	arr.add(23);
	ArrayList<Integer> brr=new ArrayList<Integer>();
	brr.add(100);
	brr.add(10);
	arr.addAll(brr);
	System.out.println(arr);
	arr.remove(3);
	System.out.println(arr);
}
}
