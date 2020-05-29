import java.util.*;
class Man
{
 int age;
 Man()
 {
  Scanner x=new Scanner(System.in);
  age=10;
 }
}
class Boy extends Man
{
 String name;
 int age;
 void display()
 {
  super();
  name=x.nextLine();
  age=x.nextInt();
  System.out.println("Name:"+name+"Age:"+age);
 }
}
class Girl extends Man
{
 String name;
 void display()
 {
  super();
  name=x.nextLine();
  System.out.println("Name:"+name+"Age:"+age);
 }
}
class Hello
{
 public static void main(String ags[])
 {
  Boy b=new Boy();
  b.display();
  Girl g=new Girl();
  g.display();
 }
}