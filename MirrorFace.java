import java.util.Scanner;
import java.util.*;

class MirrorFace
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int[] arr={2, 3, 4, 5, 6, 7, 8, 9};
int[] Marr=mirror(arr);
System.out.print("The oiginal array:");
 for(int a:arr)
 {
 System.out.print(a+"-");
 }
System.out.println();
System.out.print("The mirror image array: ");
 for(int b:Marr)
  {
 System.out.print(b+"-");
  }
}
public static int[] mirror(int[] ass)
{
int[] time=new int[ass.length*2];
for(int i=0;i<ass.length;i++)
{
time[i]=ass[i];
time[time.length-i-1]=ass[i];
}
return time;

}
/*public class PrintArrayInJava {
   private static void printArray(int[] anArray) {
      System.out.println(Arrays.toString(anArray));*/
}