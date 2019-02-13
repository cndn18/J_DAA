import java.util.Scanner;

class StringValue
{
 public static void main(String args[])
 {
 String word;
 int t,l=0,k;
  Scanner in = new Scanner(System.in);
     System.out.println("enter a string to get evaluated");
      word=in.nextLine();
      t=word.length();
  for(int i=0;i<t;i++)
   {
     char ch=word.charAt(i);
     ch=Character.toUpperCase(ch);
     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
         l++;
   }
  k=t-l;
  System.out.println("values of the word="+(k*45+l*78));
 }
}
