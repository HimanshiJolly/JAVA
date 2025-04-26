/*CodeMat is an annual programming competition organized by the Mathematics and Computing Society (MACS) at IIT BHU.
Last year, the event had X participants, while this year it attracted Y participants.
Your task is to determine whether this year's event was more successful by checking if Y is greater than X.
- If Y > X, print Yes.
- Otherwise, print No.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codemat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y>x)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}
