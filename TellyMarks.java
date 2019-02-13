import java.util.Scanner;
import java.util.*;

  class TellyMarks
   {
    public static void main(String args[])
     {
    int x1,x2,tries=0;
     Scanner in=new Scanner(System.in);
    Random mat=new Random();
    
    do
    {
     x1=mat.nextInt(6);
     x2=mat.nextInt(6);
      System.out.println(x1+" and "+x2);
       tries++;
    }
   while(x1!=x2);
   System.out.println("the numerous tries are= "+tries);
       

   } 
}
