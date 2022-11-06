//constructor_assign1_oct//
package pk1;

public class Student 
{
	public Student() 
	{
		this(1,2,3,4);
		System.out.println(" default constructor");
	}
	public Student(int a) 
	{
		this();
		System.out.println(" one parameterized constructor");
	}
	public Student(int a, int b) 
	{
		this(1,2,3);
		System.out.println(" Two parameterized constructor");
	}
	public Student(int a,int b,int c) 
	{
		this(1);
		System.out.println(" Three parameterized constructor");
	}
	public Student(int a, int b, int c, int d) 
	{
		System.out.println(" Four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Student u=new Student(1,2);
	}
}

