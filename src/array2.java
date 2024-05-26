import java.util.Scanner;
class array2
{
public static void main(String args[ ])
{
int a[ ]=new int [ 6 ];
int t,i;
Scanner sc=new Scanner(System.in);
for(i=0;i<6;i++)
{
System.out.print("enter the elements:");
a[i]=sc.nextInt();
}
for(i=0;i<3;i++)
{
t=a[i];
a[i]=a[i+3];
a[i+3]=t;
}
for(i=0;i<6;i++)
{
System.out.print(a[i]+" ");
}
}
}