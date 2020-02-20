package Assignment;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//total Retail
		double totalRetail=0;
		// Use a sentinel-controlled loop to determine when the
		//program should stop looping and display the final results.
		while(true){
		//display menu
		System.out.println("A - Product A, $22.50");
		System.out.println("B - Product B, $44.50");
		System.out.println("C - Product C, $9.98");
	    System.out.println("D- Exit program");
		System.out.print("Enter product number: ");
		String productname=sc.next();
		//exit program
		if(productname=="D"){
		break;
		}
		///Enter quantity sold
		System.out.print("Enter quantity sold: ");
		int quantitySold=sc.nextInt();
		//use a switch statement to determine the retail price
		//for each product.
		switch(productname){
		case "A":
		totalRetail+=22.50*quantitySold;
		break;
		case "B":
		totalRetail+=44.50*quantitySold;
		break;
		case "C":
		totalRetail+=9.98*quantitySold;
		break;
		default:
		totalRetail=0;
		
		}
		//display result
		System.out.println("\nThe total retail value of all products sold: $"+totalRetail);
		}
		}
	}


