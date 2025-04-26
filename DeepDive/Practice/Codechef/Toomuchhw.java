/*Chef just realized he has a ton of homework due tomorrow!
Chef has several worksheets with him, and each worksheet contains exactly Y questions.
Chef can complete at most 10 worksheets before the submission deadline.
Chef has already answered X questions, and he needs to answer at least 100 questions in total to get a full score on the homework.
Your task is to determine whether Chef can achieve a full score
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Toomuchhw
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
        if(((10*y)+x)>=100)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
	}
}
