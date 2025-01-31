/*Q2: Write a program that calculates the area of a circle using the formula π * r^2. Take the radius as input from the user.*/
import java.util.Scanner;
public class Medium {
    public static void main(String[] args)
    {
        double radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.printf("Area of circle with radius %.2f is: %.2f",radius,area);
        sc.close();
    }
}
