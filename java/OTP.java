import java.util.*;
class OTPs
{
 public static void main(String args[])
 {
  int b[]=new int[30];
  int i;
  Scanner SC=new Scanner(System.in);
  int a[]=new int[5];
  System.out.println("Enter the Array of Numbers:");
  for(i=0;i<4;i++)
  {
    a[i]=SC.nextInt();
  }
  int l=4;
  for(i=0;i<l;i++)
  {
   while(a[i]!=0)
   {
    int digit=a[i]%10;
    a[i]=a[i]/10;
    b[i]=digit;
   }
  }
  for(i=0;i<l-1;i++)
  {
   for(int j=0;j<l-1-i;j++)
   {
    if(b[j]>b[j+1])
	{
	 int temp=b[j];
	 b[j]=b[j+1];
	 b[j+1]=temp;
	}
   }
  }
  int n,m;
  n=b[l-1];
  m=8;
  int t;
  t=b[0]+b[l-1];
  int g[]=new int[3];
  g[0]=n;
  g[1]=m;
  g[2]=t;
  System.out.println("The OTP is:"+g[0]+g[1]+g[2]);
 }
}
  
