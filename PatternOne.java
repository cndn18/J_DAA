import java.util.Scanner;
import java.lang.Math;
import java.io.*;
class PatternOne
{
public static void main(String args[])
{
final int height=5;
Scanner in =new Scanner(System.in);
for(int i=1;i<height;i++)
{
 for(int j=1;j<=height-i;j++)
 {
 System.out.print(" ");
 }
 int y=(int)Math.pow(11,(i-1));
 for(int k=y;k>0;k=k/10)
 {
 int m=k%10;
 System.out.print(m+" ");
 }

System.out.println();
}
}
}