package Assignment;
import java.util.*;

public class ArrayStack {
static final int MAX=1000;
static int top=-1;
int a[]=new int[MAX];
void push(int data)
{
	if (top >= (MAX - 1)) { 
        System.out.println("Stack Overflow"); 
        
    } 
    else { 
        a[++top] = data; 
        System.out.println(data + " pushed into stack"); 
        
    } 
}
int pop()
{
	 if (top < 0) { 
         System.out.println("Stack Underflow"); 
         return 0; 
     } 
     else { 
         int data = a[top--]; 
         return data; 
     } 
}
void display() {
	for(int i=top;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayStack s=new ArrayStack();
		s.push(100);
		s.push(10);
		s.push(90);
		s.display();
		s.pop();
		

	}

}
