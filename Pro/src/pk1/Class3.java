// Assign2_oct_(((((10*2)+2)-2)-2)/2)//
package pk1;

public class Class3 
{
public int multi(int a,int b)
{
	int c;
	c=a*b;
	System.out.println(" multi ="+c);
	return c;
}
public int sum(int a1,int b1)
{
	int d;
	d=a1+b1;
	System.out.println(" multi ="+d);
	return d;
}
public int sub(int a2,int b2)
{
	int e;
	e=a2-b2;
	System.out.println(" multi ="+e);
	return e;
}
public int div(int a3,int b3)
{
	int f;
	f=a3*b3;
	System.out.println(" multi ="+f);
	return f;
}
public static void main(String[] args) 
{
	Class3 u=new Class3();
	int multiresult=u.multi(10, 2);
	int sumresult=u.sum(multiresult, 2);
	int subresult=u.sub(sumresult, 2);
	int subresult1=u.sub(subresult, 2);
	u.div(subresult1, 2);
}
}
