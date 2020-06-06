import java.util.*;
class Persons
{
 public String name;
 Persons()
 {
  this.name="ABC";
 }
 void display()
 {
  System.out.println("Name:"+name);
 }
}
class Teacher extends Persons
{
 double sal;
 String sub;
 Teacher()
 {
  super();
  this.sal=8000;
  this.sub="Geo";
 }
 void display()
 {
  super.display();
  System.out.println("Salary:"+sal);
  System.out.println("Subject:"+sub);
 }
}
class Student extends Persons
{
 int roll;
 Student()
 {
  super();
  this.roll=1;
 }
 void display()
 {
  super.display();
  System.out.println("Roll No:"+roll);
 }
}
class CollegeStudent extends Persons
{
 int year;
 String major;
 CollegeStudent()
 {
  super();
  this.year=2018;
  this.major="CSCE";
 }
 void display()
 {
  super.display();
  System.out.println("Year of Joining:"+year);
  System.out.println("Major:"+major);
 }
}
class College
{
 public static void main(String args[])
 {
  Teacher t=new Teacher();
  t.display();
  CollegeStudent CS=new CollegeStudent();
  CS.display();
 }
}