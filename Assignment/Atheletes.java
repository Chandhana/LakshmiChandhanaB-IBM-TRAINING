package Assignment;
import java.util.*;
class Athlete
{
	int rollno;
	String name;
	Athlete(String name,int rollno)
	{
		this.rollno=rollno;
		this.name=name;
		
	}
}
class NameSort implements Comparator<Athlete>
{
	public int compare(Athlete a1,Athlete a2)
	{
		return a1.name.compareTo(a2.name);
	}
	
}
public class Atheletes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Athlete> ar=new ArrayList<Athlete>();
  ar.add(new Athlete("Lakshmi ",302));
  ar.add(new Athlete("Chandhana ",88));
 // ar.add(new Athlete("kamala", 100));
  Collections.sort(ar,new NameSort());
  for(Athlete a:ar)
  {
	  System.out.println(a.name+""+a.rollno);
  }
 
	}

}
