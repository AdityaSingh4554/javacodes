import java.util.*;
class program4
{
public static void main(String args[])
{
double p,r,t,a=0,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the principal value:");
p=sc.nextDouble();
System.out.println("enter the rate:");
r=sc.nextDouble();
System.out.println("enter the time taken:");
t=sc.nextDouble();
a=p*Math.pow((1+(r/100)),t);
System.out.println("the value of amount:"+a);
c=a-p;
System.out.println("the value of compound interest:"+c );
}
}