package com;

public class Student {
	String name;
	int id;
	String course;
	static String cname="St Joseph's";
	Student()//Default constructor
	{
		this.name="firstname";
		this.id=88;
		this.course="training";
	}
	Student(String name,int id,String course)//parameterized constructor
	{
		this.name=name;
		this.id=88;
		this.course=course;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
void setSt(String name,int id,String course)
{
	this.name=name;
	this.id=id;
	this.course=course;
}
	
	void showData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.course);
		System.out.println(Student.cname);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.getName();
		s1.getCourse();
		s1.getId();
		//s1.setCourse("CSE");
		//s1.getCourse();
		//s1.setSt("lakshmi",88,"CSE");
		
		s1.showData();
	//System.out.println(Student.cname);
     Student s2=new Student("Chandhana",88,"BE");
    // System.out.println(Student.cname);
     s2.showData();
	}

}
