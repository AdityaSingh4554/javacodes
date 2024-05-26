import java.util.Scanner;
class str1
{
public static void main(String args[ ])
{
int i,len;
String s;
Scanner sc=new Scanner(System.in);
System.out.print("enter any string :");
s=sc.nextLine();
len=s.length();
System.out.println("length:"+len);
for(i=0;i<len;i++)
{
char ch=s.charAt(i);
System.out.println(ch);
}
}
}


