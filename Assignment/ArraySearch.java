package Assignment;
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 //int n=scan.nextInt();
 int flag=0;
 int arr[]=new int[10];
 for(int i=0;i<10;i++)
 {
	  arr[i]=scan.nextInt();
 
	}
 int findno=scan.nextInt();
 for(int i=0;i<10;i++)
 {
	  if(arr[i]==findno)
	  {
		  flag=1;
	  }
	  else
	  {
		  flag=0;
	  }
	}
 if(flag==1)
 {
	 System.out.println(findno+" "+"FOUND");
 }
 else
 {
	 System.out.println(findno+" "+"NOT FOUND");
	 
 }
	}
}
