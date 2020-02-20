package Assignment;
import java.util.*;
class Athelete3
{
	
	String name;
	int rollno;
	Athelete3(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
@Override
	public String toString() {
		return "Athelete3 [name=" + name + ", rollno=" + rollno + "]";
	}
}
class SortByName implements Comparator<Athelete3>
{
	public int compare(Athelete3 a,Athelete3 a2)
	{
		return a.name.compareTo(a2.name);
		
	}
}
class SortByRoll implements Comparator<Athelete3>
{
	public int compare(Athelete3 a,Athelete3 a2)
	{
		return a.rollno-a2.rollno;
		
	}
}

public class Atheletesortbyrollandname {
public static void main(String[] args)
{
	Athelete3[]a3= {new Athelete3("abc",123),new Athelete3("add",190),new Athelete3("doll",188),new Athelete3("jacob",375),
			new Athelete3("lakshmi",1809),new Athelete3("Zara",1890),new Athelete3("quora",188),new Athelete3("Tiara",908),
	};
	//Before Sorting
	System.out.println("Before Sorting");
	for(int i=0;i<a3.length;i++)
	{
		System.out.println(a3[i]);
		
	}
	Arrays.sort(a3,new SortByRoll());
	
	System.out.println("After Sorting");
	//After Sorting
	for(int i=0;i<a3.length;i++)
	{
		System.out.println(a3[i]);
		
	}
}
}

