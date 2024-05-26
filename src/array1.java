import java.util.Scanner;
class array1
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
for(i=0;i<6;i=i+2)
{
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
for(i=0;i<6;i++)
{
System.out.print(a[i]+" ");
}
}
}