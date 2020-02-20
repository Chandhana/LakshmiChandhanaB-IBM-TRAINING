package Assignment;

public class StringExercise {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="“The quick brown fox jumps over the lazy dog";
		System.out.println(str.charAt(12));
		String[]arr=str.split(" ");
		int flag=0;
		//System.out.println(arr.length);
		for(String a:arr)
		{
		//	System.out.println(a);
			if(a.equals("is"))
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
			System.out.println("It exists");
		}
		else
		{
			System.out.println("Does not exist" );
		}
	
	}

}
