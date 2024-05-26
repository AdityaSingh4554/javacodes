class Apple
{
String s;
public Apple()
{
s="Aditya";
}
public Apple(String str)
{
s=str;
}
void show()
{
System.out.println(s);
}
}
class mainp2
{
public static void main(String args[])
{
Apple obj1=new Apple();
obj1.show();
Apple obj2=new Apple("21");
obj2.show();
}
} 