package File;
import java.io.FileOutputStream;
public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\test.txt");
			fout.write(65);
			fout.close();
			System.out.println("success");
			
		}catch(Exception e) {System.out.println(e);}
   
	}

}
