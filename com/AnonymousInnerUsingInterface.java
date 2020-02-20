package com;
interface Eatable
{
	void eat();
}

public class AnonymousInnerUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eatable e=new Eatable()
	      {
			public void eat()
			{
				System.out.println("I eat everything possible that is vegeterian :P");
			}
	    };
		
 e.eat();
	}

}
