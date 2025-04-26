/*You are given an assignment from your institute.
Each assignment has a difficulty value between 1 and 100 (both inclusive).
AI can solve an assignment if and only if the difficulty of the assignment is less than or equal to 60.
Your current assignment has a difficulty value of X.
Determine if AI is capable of solving your assignment.
Print "YES" if AI can solve it, and "NO" if it cannot (without the quotes).
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class AI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
        if(x<=60)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}
