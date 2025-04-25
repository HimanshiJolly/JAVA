//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        if(x%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}
