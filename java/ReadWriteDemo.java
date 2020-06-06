import java.until.*;
class ReadWriteDemo
{
 public static void main(String args[]) throws IOException{
 if(args.length!=2)
 {
  System.out.println("Usage: Java ReadWriteDemoSample.txt");
  System.exit(0);
 }
 File f=new File(args[0]);
 byte[] b={};
 if(f.exist())
 {
  FileInputStream f1=new FileInputStream(f);
  int num=f1.available();
  b=new byte[num];
  int n=f1.read(b);
  String s=new String(b);
  System.out.println("Contents of "+args[0]+":"+s);
  f1.close();
  f=null;
 }
 else
 {
  System.out.println("File Does not Exist");
  System.exit(0);
 }
}
}