import java.util.*;
class binary
{
public static void main(String args [ ])
{
int a[ ]=new int[6];
int i,mid,flag=0,low=0;
int high=6-1;

System.out.println("enter the elements of the array:");
Scanner sc=new Scanner(System.in);
for(i=0;i<6;i++)
{
a[i]=sc.nextInt();

}
System.out.print("enter the elements for searching:");
int search=sc.nextInt();

while(low<=high)
{
mid=(low+high)/2;

if(a[mid]>search)
high=mid-1;

else if(a[mid]<search)
low=mid+1;

else
{
System.out.print("found at" +mid);
flag=1;
break;}
}

if(flag==0)
{
System.out.print("Not found");
}
}
}