package Assignment;
import java.util.Scanner;

public class Primepalin {
public static void main(String[]args)
{ System.out.println("Enter number:");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int flag=0;
	int rev=0,r;
	   int copy=num;
	  
	while(num!=0)
	{
		r=num%10;
		rev=rev*10+r;
		num=num/10;
	}
	if(copy==rev)
	{ 
		System.out.println("Palindrome");
	  int m=(int)Math.pow(copy, 0.5);
		for(int i=2;i<=m;i++)
		   {
			  if(copy%i==0)
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
			  System.out.println(num+"p");
	}
	}
	  
}
}
