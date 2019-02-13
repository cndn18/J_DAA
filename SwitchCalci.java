import java.util.Scanner;
 class SwitchCalci
{
public static void main(String args[])
{
int ch,sol;
Scanner in=new Scanner(System.in);
System.out.println("Enter two number");
int x=in.nextInt();
int y=in.nextInt();
do
{
System.out.println();
System.out.println();

System.out.println("1:addition of two number");
System.out.println("2:subtraction of two number");
System.out.println("3:multiplication of two number");
System.out.println("4:division of two number");
System.out.println("5:mean of two number");
System.out.println("6:exit the program");
System.out.println();
System.out.print("enter your choice:");
ch=in.nextInt();
switch(ch)
{

case 1:sol=x+y;
         System.out.println("x + y="+sol);
         break;
case 2:sol=x-y;
         System.out.println("x - y="+sol);
         break;
case 3:sol=x*y;
         System.out.println("x * y="+sol);
         break;
case 4:sol=x/y;
         System.out.println("x / y="+sol);
         break;
case 5:sol=(x+y)/2;
         System.out.println("x mean ys="+sol);
         break;
case 6:System.out.println("thanks for using our calci");
         break;
         }
}
while(ch!=6);

}
}