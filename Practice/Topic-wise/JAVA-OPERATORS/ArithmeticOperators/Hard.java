/*Q3: Implement a program that converts temperature from Celsius to Fahrenheit using the formula: */
import java.util.Scanner;
public class Hard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celcius:");
        double celsius=sc.nextDouble();
        double f=(celsius*(9.0/5.0))+32;
        System.out.println("Temperature in fahrenheit: "+f);
        sc.close();
    }
}
