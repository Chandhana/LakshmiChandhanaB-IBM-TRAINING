package Assignment;

public class AreaOverloading {
	static final double PI=3.14;
double Areas(double l,double b)
{ System.out.println("Rectangle Area");
	return (l*b);
}
double Areas(double a,double b,double c)

{ double p=((a+b+c)/2);
  double Area=Math.pow((p*(p-a)*(p-b)*(p-c)),0.5);
  System.out.println("Area Of a Traingle");
  return Area;
  
	
}
double Areas(double r)
{ System.out.println("Circle Area");
  return(PI*r*r);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AreaOverloading a=new AreaOverloading();
 System.out.println(a.Areas(14d));
System.out.println(a.Areas(24,30,18));
System.out.println(a.Areas(10,15.5));
 
	}

}
