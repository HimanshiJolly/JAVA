/*Q1: Write a program that takes two integers as input and prints their sum, difference, product, quotient, and remainder. */
import java.util.Scanner;
public class Easy
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter x:");
        x=sc.nextInt();
        System.out.println("Enter y:");
        y=sc.nextInt();
        int sum=x+y;
        System.out.println("Sum of "+x+" and "+y+" is: "+sum);
        int diff=x-y;
        System.out.println("difference of "+x+" and "+y+" is: "+diff);
        int product=x*y;
        System.out.println("Product of "+x+" and "+y+" is: "+product);
        if(y!=0){
        int quo=x/y;
        System.out.println("Quotient of "+x+" and "+y+" is: "+quo);
        int rem=x%y;
        System.out.println("Remainder of "+x+" and "+y+" is: "+rem);}
        else
        System.out.println("division and remainder cannot be performed as y is 0");
        sc.close();
    }
}