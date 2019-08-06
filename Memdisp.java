// 3.2 dynamic memory dispatch
class figure
{
	double d1,d2;
	figure(double a,double b)
	{
		d1=a;
		d2=b;
	}
	double area()
	{
		System.out.println("Area of the figure");
		return 0;
	}
}
class rectangle extends figure
{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of rectangle");
		return d1*d2;
	}
}
class triangle extends figure
{
	triangle(double a,double b)
	{
		super(a,b);	
	}
	double area()
	{
		System.out.println("Area of triangle");
		return d1*d2/2;
	}
}
class Memdisp
{
	public static void main(String[] args)
	{
		figure f=new figure(45,6);
		rectangle r=new rectangle(10,30);
		triangle t=new triangle(10,20);
		figure a;
		a=f;
		System.out.println(a.area());
		a=r;
		System.out.println(a.area());
		a=t;
		System.out.println(a.area());
	}
}

/* Area of the figure
0.0
Area of rectangle
300.0
Area of triangle
100.0
*/