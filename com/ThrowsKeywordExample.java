package com;
import java.io.IOException;

public class ThrowsKeywordExample {
void m()throws IOException{
	throw new IOException("device error");
}
void n()throws IOException{  
    m();  
  }  
void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   ThrowsKeywordExample obj=new ThrowsKeywordExample();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}

