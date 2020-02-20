package com;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'j','a','v','a'};
		String s=new String(ch);//converting character to string
		String str="HelloWorld";
		System.out.println(s);
		System.out.println(str);
		System.out.println(str.charAt(3));
		System.out.println(str.codePointAt(3));//get unicode value
		System.out.println(str.concat("says Lakshmi Chandhana"));
		//Another way to create is using new keyword
		
       System.out.println(str.length());
       System.out.println(str.replace('H', 'h'));
	}

}
