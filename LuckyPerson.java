import java.util.*;
import java.util.Scanner;

class LuckyPerson
{
public static void main(String args[])
{
int nop;
Scanner in=new Scanner(System.in);
Random sat=new Random();

System.out.println("Enter the mumber the players in the game");
nop=in.nextInt();
int[] no=new int[nop];
String[] name=new String[nop];

for(int i=0;i<nop;i++)
{
System.out.print("Name of the player:");
name[i]=in.nextLine();
no[i]=sat.nextInt(6)+sat.nextInt(6);
System.out.println(" scored "+no[i]);
}
 int max=no[0];
for(int j=0;j<nop;j++)
{
  if(no[j]>max)
      max=no[j];
}
Arrays.sort(no);
int d=Arrays.binarySearch(no,max);
System.out.println("The luckiest person is "+name[d]+" scoring "+no[d]);
}
}