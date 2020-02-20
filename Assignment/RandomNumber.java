package Assignment;
import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand=new Random();
int upperbound=100;
int intnum = rand.nextInt(upperbound); 
double doublenum=rand.nextDouble();
float floatnum=rand.nextFloat();
System.out.println("Random integer value from 0 to" + (upperbound) + " : "+ intnum);
System.out.println("Random float value between 0.0 and 1.0 : "+floatnum);
System.out.println("Random double value between 0.0 and 1.0 : "+doublenum);
System.out.println(Math.ceil(intnum));
System.out.println(Math.ceil(doublenum));
System.out.println(Math.ceil(floatnum));
System.out.println("Floor");
System.out.println(Math.floor(intnum));
System.out.println(Math.floor(doublenum));
System.out.println(Math.floor(floatnum));


	}

}
