import java.util.*;
class bubble
{
public static void main(String args[ ])
{
int a[ ]=new int[6];
int i,j,t=0;
System.out.println("enter the elements of the array: ");
Scanner sc=new Scanner(System.in);

for(i=0;i<6;i++)
{
    a[i]=sc.nextInt();
}

for(i=0;i<6;i++)
{
   for(j=0;j<6-1-i;j++)
    {
          if(a[j]<a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
             }
     }
}
System.out.print("the array after sorting :");
for(i=0;i<6;i++)
{
System.out.print(a[i]+"  ");

}
}
}
