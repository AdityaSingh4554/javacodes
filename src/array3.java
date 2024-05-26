import java.util.*;
class array3
{
public static void main(String args[ ])
{
int a[ ]=new int [ 6 ];
int search,flag=0,i;
Scanner sc=new Scanner(System.in);
for(i=0;i<6;i++)
{
System.out.print("enter the elements:");
a[i]=sc.nextInt();
}
System.out.print("enter the number for searching:");
search=sc.nextInt();
for(i=0;i<6;i++)
{
if (a[i]== search)
{
flag=1;
System.out.print("found at:"+i);
}
}
if (flag==0)
System.out.print("not found");
}
}