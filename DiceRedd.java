import java.util.Scanner;
import java.util.*;

class DiceRedd
{
public static void main(String args[])
{
final int rate=130000;
Scanner in =new Scanner(System.in);
Random nat=new Random();
int[] dice=new int[13];
 
for(int i=0;i<rate;i++)
{
int x1=nat.nextInt(6)+1;
int x2=nat.nextInt(6)+1;
dice[x1+x2]++;
}
for(int j=2;j<dice.length;j++)
{
System.out.println("percentage of "+j+" rolled in the process : "+100.0*dice[j]/rate+"% ");
}
}
}