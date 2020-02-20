package com;

public class LocalInnerClass {
    private int data=20;
    void show()
    {
    	
    	class Local
    	{
    		void readnow()
    		{
    			System.out.println("private data can be accessed by inner class "+ data);
    		}
    	}
    	Local l=new Local();
    	l.readnow();
    }

public static void main(String args[])
{
	LocalInnerClass lic=new LocalInnerClass();
	lic.show();
}
}
