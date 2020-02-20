package Assignment;
import java.util.Scanner;
public class CubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,root;
     //   System.out.print("Enter n value : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  for(n=2;n<=100;n++)
  {
	  root=(int)Math.pow(n, 0.5);
	  for( i=2;i<=root;i++)
	  {
		  if(n%i==0)
		  {
			  break;
		  }
		  else
		  {
			  continue;
		  }
	  }
  
if(i>root)
{
	float cuberoot=(float)Math.pow(n, 0.333);
	System.out.println("Number is"+n);
	System.out.println("root is"+cuberoot);
}
	
  }
}

}