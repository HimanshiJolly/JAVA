/*Chef goes to the gym daily and follows a progressive bench press routine. In the 1st set, Chef lifts X
 kilograms. For each subsequent set, the weight is increased by 10 kilograms. Your task is to calculate the 
 amount of weight Chef will bench in the 3rd set 
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class Canubench {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x+10+10);
        sc.close();
	}

}
