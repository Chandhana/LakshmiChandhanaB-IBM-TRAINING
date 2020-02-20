package Assignment;
import java.util.Scanner;
public class MatriceAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int rc=scan.nextInt();
		int arr[][]=new int[rc][rc];
		int brr[][]=new int[rc][rc];
		int crr[][]=new int[rc][rc];
		System.out.println("Enter values for matrix arr");
		for(int i=0;i<rc;i++)
		{
			for(int j=0;j<rc;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter values for matrix brr");
		for(int p=0;p<rc;p++)
		{
			for(int q=0;q<rc;q++)
			{
				brr[p][q]=scan.nextInt();
			}
		}
		System.out.println("Adding these matrices");
		
		for(int a=0;a<rc;a++)
		{
			for(int b=0;b<rc;b++)
			{
				crr[a][b]=arr[a][b]+brr[a][b];
				System.out.print(crr[a][b]+" ");
			}
			System.out.println();
			
		}

	}

}
