import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*;
class Alnums
{
 public static void main(String args[])
 {
  String a;
  Scanner SC=new Scanner(System.in);
  System.out.println("Enter your Alphanumeric String:");
  a=SC.nextLine();
  int i,prev,sum,j;
  sum=0;
  i=0;
  j=0;
  int x[][]=new int[3][3];
  int y[][]=new int[3][2];
  for(i=0;i<a.length();i++)
  {
   while(Character.isDigit(a.charAt(i)))
   {
    x[i][j]=a.charAt(i);
	j++;    
   }
   while(Character.isDigit(a.charAt(i))!==0)
   {
     y[i][j]=a.charAt(i-1);
	 y[i][++j]=i+1;
   }
  }
  for(i=0;i<3;i++)
  {
   sum+=((x[i][j]+x[i][++j])*x[i][++j]);
  }
  for(i=0;i<3;i++)
  {
   for(j=0;j<2;j++)
   {
    sum+=y[i][j];
   }
  }
  System.out.println("Hence the Sum of the String is:"+sum);
 }
}