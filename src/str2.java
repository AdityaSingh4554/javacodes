import java.util.Scanner;
class str2
{
public static void main(String args[ ])
{
int i;
String s,t;
Scanner sc=new Scanner(System.in);
System.out.print("enter any string:");
s=sc.nextLine();
System.out.print("enter another string:");
t=sc.nextLine();
i=s.compareTo(t);
if(i>0)
{
System.out.print(s+" greater");
}
else if(i<0)
{
System.out.print(t+" greater");
}
else
{
System.out.print(" Identical ");
}
}
}