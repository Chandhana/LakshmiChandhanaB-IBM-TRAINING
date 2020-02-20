package Assignment;

public class SimpleInterestOverloading {
	double calculateSI(double p,double r,int t)
	{
		return ((p*r*t)/100);
	}
	float calculateSI(float p,float r,int t)
	{
		return ((p*r*t)/100);
	}
	double calculateSI(float p,double r,int t)
	{
		return ((p*r*t)/100);
	}
	double calculateSI(double p,float r,int t)
	{
		return ((p*r*t)/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SimpleInterestOverloading s=new SimpleInterestOverloading();
 System.out.println(s.calculateSI(10000d, 10d, 5));
 System.out.println(s.calculateSI(20000f, 10.5f, 2));
 System.out.println(s.calculateSI(30000f, 10d, 3));
 System.out.println( s.calculateSI(40000d, 10f, 4));
	}

}
