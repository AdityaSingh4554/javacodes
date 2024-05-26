import java.util.*;
class plant
{
int x,y,z;
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("	Enter two numbers:");
x=sc.nextInt();
y=sc.nextInt();
}
void swap()
{
z=x;
x=y;
y=z;
}
void display()
{
System.out.println("x:" +x);
System.out.println("y:" +y);
}
}
class mainp
{
public static void main(String args[ ])
{
plant obj=new plant();
obj.accept();
obj.swap();
obj.display();
}
}
