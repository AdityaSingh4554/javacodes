class aditya
{
	String s;
	public aditya()
	{
		s="good afternoon";
	}
	public aditya(String a)
	{
		s=a;
	}
	void show()
	{
		System.out.println(s);
	}
}

public class prog1 {

	public static void main(String[] args) {
		
aditya obj1=new aditya();
obj1.show();
aditya obj2=new aditya("hi adi");
obj2.show();
	}

}
