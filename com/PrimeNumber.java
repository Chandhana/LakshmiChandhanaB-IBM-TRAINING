package com;

public class PrimeNumber {
public static void main(String[] args)
{int flag=0;
   int num=37;
  int m=(int)Math.pow(num,0.5);
  for(int i=2;i<=m;i++)
   {
	  if(num%i==0)
	  {
		  flag=1;
		  break;
	  }
    }
  if(flag==1)
  {
	  System.out.println(" not prime");
  }
  else
  {
	  System.out.println("prime");
  }
  
}
}
