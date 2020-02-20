package Assignment;
import java.util.Scanner;
public class TaxSlab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter the salary");
  Scanner scan =new Scanner(System.in);
  int salary =scan.nextInt();
  System.out.println("Enter category woman or general:");
  String category=scan.next();
   if(category.equals("general"))
   {
	   if((salary>=0)&&(salary<=180000))
	   {
		   System.out.println("No Tax");
	   }
	   else if((salary>=180001)&&(salary<=500000))
	   { System.out.println("Tax is 10%");
		   int minusamt=(int) (salary*0.1);//10%
		   int tax=salary-minusamt;
		   System.out.println("Tax for category general for salary"+" "+tax);
	   }
	   else if((salary>=500001)&&(salary<=800000))
	   {System.out.println("Tax is 20%");
		   int minusamt=(int) (salary*0.2);//20%
		   int tax=salary-minusamt;
		   System.out.println("Tax for category general for salary"+" "+tax);
	   }
	   else if(salary>=800000)
	   {System.out.println("Tax is 30%");
		   int minusamt=(int) (salary*0.3);//30%
		   int tax=salary-minusamt;
		   System.out.println("Tax for category general for salary"+" "+tax);
	   }
   }
   else  if(category.equals("women"))
   {
	   if((salary>=0)&&(salary<=190000))
	   {
		   System.out.println("No Tax");
	   }
	   else if((salary>=190001)&&(salary<=500000))
	   {System.out.println("Tax is 10%");
		   int minusamt=(int) (salary*0.1);//10%
		   int tax=salary-minusamt;
		   System.out.println("Tax for category woman for salary"+" "+tax);
	   }
	   else if((salary>=500001)&&(salary<=800000))
	   {System.out.println("Tax is 20%");
		   int minusamt=(int) (salary*0.2);//20%
		   int tax=salary-minusamt;
		   System.out.println("Tax for category woman for salary"+" "+tax);
	   }
	   else if(salary>=800000)
	   {System.out.println("Tax is 30%");
		   int minusamt=(int) (salary*0.3);//30%
		   int tax=salary-minusamt;
		   System.out.println("Tax for category woman for salary"+" "+tax);
	   }
   }
	}

}
