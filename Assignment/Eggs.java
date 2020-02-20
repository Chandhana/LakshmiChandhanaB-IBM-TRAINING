package Assignment;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int eggs,gross,dozen,remg,remd;
      Scanner scan =new Scanner(System.in);
      eggs=scan.nextInt();
      
      
       gross=eggs/144;
      remg=eggs%144;
       dozen=remg/12;
      remd=remg%12;
      
      System.out.println(gross+""+"gross"+" "+dozen+" "+"dozen"+" "+remd+" "+" eggs");
      
      
	}

}
