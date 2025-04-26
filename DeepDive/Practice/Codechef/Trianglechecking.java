/*You are given 3 sticks of lengths A, B, and C.
Your task is to check whether these can be the side lengths of a valid non-degenerate triangle.
Recall that A, B, and C can form a non-degenerate triangle if and only if all of the following three conditions hold:
- A + B > C
- B + C > A
- A + C > B
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Trianglechecking
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();
      int B=sc.nextInt();
      int C=sc.nextInt();
      if((A+B>C)&&(B+C>A)&&(A+C>B))
      {
          System.out.println("Yes");
      }
      else{
          System.out.println("No");
      }
      sc.close();
	}
}
