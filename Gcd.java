import java.util.Scanner;

class Gcd
{
public static void main(String args[])
{
int x1,x2;
Scanner in =new Scanner(System.in);
System.out.println("Enter two numbers");

x1=in.nextInt();
x2=in.nextInt();
if(x1>x2)
{
 while(x1%x2!= 0)
 {
int temp;
  temp=x2;
  x2=x1%x2;
  x1=temp;
 }
 System.out.println("The gcd of the two numbers is="+x2);
}
else
{
  while(x2%x1!= 0)
  {
  int temp;
  temp=x1;
  x1=x2%x1;
  x2=temp;
  }
 System.out.println("The gcd of the two numbers is="+x1);
}
}
}
