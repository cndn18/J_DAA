import java.util.Scanner;

import java.text.DecimalFormat;
public class time

{

public static void main(String[] args)
  
{
      
DecimalFormat df=new DecimalFormat(".#");
float cm, inches;
   
int feet;
  
System.out.println("enter cm");
     
Scanner s=new Scanner(System.in);
        
cm=s.nextFloat();
    
float c=cm;

feet=(int)(cm/30.48);
     
cm=cm-(float)(feet*30.48);
     
inches=(float)(cm/2.54);
        
System.out.println(c+" centimeters is "+feet+ " foot "+df.format(inches)+" inches");
    }
}
        
        