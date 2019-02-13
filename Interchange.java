import java.util.Scanner;

import java.util.Arrays;

class Interchange
{
public static void main(String args[])
{
int[] x=new int[10];
Scanner in=new Scanner(System.in);
System.out.println("enter the numbers");
for(int i=0;i<10;i++)
{
x[i]=in.nextInt();
}
System.out.println("the original array is: "+Arrays.toString(x));
int[] y=interchange(x);
System.out.println();
System.out.println("the interchange array is: "+Arrays.toString(y));

}
public static int[] interchange(int[] z)
{
 for(int i=0;i<10;i=i+2)
  {
  int temp=z[i];
  z[i]=z[i+1];
  z[i+1]=temp; 
  }
return z;
}
}
