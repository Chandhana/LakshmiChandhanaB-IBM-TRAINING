package Assignment;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int max=0;
		int min=10000;
int arr[]= {10,2,30,40,50,60,70,80,90,100};
 for(int i=0;i<arr.length;i++)
 {
	 if(arr[i]>max)
	 {
		 max=arr[i];
	 }
 }
 System.out.println("max value is:"+max);
 for(int i=0;i<arr.length;i++)
 {
	 if(arr[i]<min)
	 {
		 min=arr[i];
	 }
 }
 System.out.println("min value is:"+min);
	}

}
