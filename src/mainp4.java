interface tiger
{
	void show();
}
interface lion extends tiger
{
	void display();
}
class  D  implements lion{
	public void display()
	{
		System.out.println("omg");
	}


public void show(){
	System.out.println("good afternoon");
}

}

public class mainp4 {

	public static void main(String[] args) {
		
D obj=new D();
obj.display();
obj.show();
	}

}
