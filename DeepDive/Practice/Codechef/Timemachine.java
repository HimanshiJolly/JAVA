/*Chef is currently in the year X in Chefland. He possesses a time machine that allows him to travel at most 25 years into the future, but he can use it only once.
Your task is to determine whether Chef can reach the year 2050 with a single use of the time machine.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Timemachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(2050-x<=25)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
	}
}
