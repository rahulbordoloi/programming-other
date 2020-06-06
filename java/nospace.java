import java.util.*;
public class nospaces
{
 public static void main(String args[]) throws IOException
 {
  FileInputStream f=null;
  File f=new File("Rahul.txt");
 try{
     f=new FileInputStream(ff);
     char c;
     while(f.available()>0)
     {
      c=(char) f.read();
      if(c==' ')
       System.out.print(" ");
      else
       System.out.print(c);
     }
	}
	catch(Exception ee)
	{
	 ee.printStackTrace();
	}
 }
}
 