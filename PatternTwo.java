import java.util.Scanner;

class PatternTwo
{
public static void main(String args[])
{
final int height=7;
Scanner in =new Scanner(System.in);
for(int i=0;i<height;i++)
{
 for(int j=0;j<height-i;j++)
  {
  System.out.print(j+1);
  }
 for(int k=0;k<i;k++)
  {
  System.out.print("  ");
  }
 for(int l=height-i;l>0;l--)
  {
  System.out.print(l);
  }
System.out.println();
}
}
}