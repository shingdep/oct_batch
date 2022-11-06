// Assignment1-------------------(((((10+2)+2)-2)*2)/2)//
package pk1;

public class Class2 
{
public int sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println(" Sum is"+c);
	return c;
}
public int sub(int a1, int b1)
{
	int d;
	d=a1-b1;
	System.out.println(" Sub is"+d);
	return d;
}
public int mul(int a2, int b2)
{
	int e;
	e=a2*b2;
	System.out.println(" Mul is"+e);
	return e;
}
public int div(int d1, int d2)
{
	int f;
	f=d1/d2;
	System.out.println(" Div is"+f);
	return f;
}
public static void main(String[] args) 
{
Class2 u=new Class2();
int sumresult=u.sum(10,2);
int sumresult1=u.sum(sumresult,2);
int subresult=u.sub(sumresult1,2);
int multiresult=u.mul(subresult, 2);
u.div(multiresult, 2);
}
}
