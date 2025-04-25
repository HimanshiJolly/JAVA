    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    import java.util.Scanner;
    public class SimpleInterest {
        public static void main(String[] args)
        {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of p,t,r: ");
        System.out.print("p: ");
        int p=sc.nextInt();
        System.out.print("t: ");
        int t=sc.nextInt();
        System.out.print("r: ");
        int r=sc.nextInt();
        int si=((p*r*t)/100);
        System.out.println("Simple Interest: "+ si);
        sc.close();
        }
    }
