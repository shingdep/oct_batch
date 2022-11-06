//this_method_oct_assign2//
package pk1;

public class Student1 
{
	public void m1()
	{
		System.out.println(" default method");
	}
	public void m2(int a)
	{
		System.out.println(" one parameterized method");
	}
	public void m3(int a,int b)
	{
		this.m4(1,2,3);
		this.m1();
		this.m5(1,2,3,4);
		this.m2(1);
		System.out.println(" Two parameterized method");
	}
	public void m4(int a,int b, int c)
	{
		System.out.println(" three parameterized method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println(" Four parameterized method");
	}
	public static void main(String[] args) 
	{
		Student1 t=new Student1();
		t.m3(1, 2);
	}
}