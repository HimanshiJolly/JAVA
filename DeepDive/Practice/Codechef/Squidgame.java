/*Squid Game - Piggy Bank
In the deadly "Squid Game," the participants start with N players. After the game ends, only K players survive. The prize pool increases based on the number of players eliminated.
Each eliminated player contributes a fixed amount of 10,000 units to the prize pool.
Your task is to calculate the total prize money added to the pool, given the number of players N at the start of the game and the number of players who survive, 
K. */
import java.util.Scanner;
public class Squidgame {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
		int n=sc.nextInt();
        System.out.print("Enter x:");
		int x=sc.nextInt();
		int contributers=n-x;
        System.out.print("Prizepool: ");
		System.out.print((n-x)*10000);
        sc.close();
	}
}
