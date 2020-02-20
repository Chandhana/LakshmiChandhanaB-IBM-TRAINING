package Assignment;

public class AverageOverloading {
int Avg(int a,int b)
{   System.out.println("Average using Integer");
	return((a*b)/2);
	
}
float Avg(float a,float b)
{
	System.out.println("Average using Float");
	return((a*b)/2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageOverloading avg=new AverageOverloading();
		System.out.println(avg.Avg(10, 20));
		System.out.println(avg.Avg(10.8f,11f));

	}

}
