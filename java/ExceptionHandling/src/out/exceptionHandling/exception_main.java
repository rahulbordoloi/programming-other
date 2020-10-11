package out.exceptionHandling;

import java.util.Scanner;

public class exception_main extends Exception{

    public static void main(String[] args) {

        // System.out.println("Exception Handling in Java by Rahul");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int x = scanner.nextInt();
        try {
            if (x < 0) {
                //throw x;
                throw new ArithmeticException("Less than Zero Error");
            }
            else{
                System.out.println("No Exception Found!");
            }
        }
        //catch(int y){
            //System.out.println("Exception Handled" +  y);
        //}
        catch(Exception e){
            System.out.println("Default Exception! : " + e);
        }
        finally{
            System.out.println("Finally Block!");
        }
    }
}
