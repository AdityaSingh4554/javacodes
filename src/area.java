class circle
{
	double r,ar;
	public circle()
	{
		r=3;
		ar=3.14*r*r;
	}
	public circle(double a)
	{
		r=a;
		ar=3.14*r*r;
	}
	void show()
	{
		System.out.println("Area="+ar);
	}
}

public class area {

	public static void main(String[] args) {
circle obj1=new circle();
obj1.show();
circle obj2=new circle(17.5);
obj2.show();
}
}
