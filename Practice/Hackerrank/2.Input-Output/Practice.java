/*Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin. */
import java.util.Scanner;

public class Practice{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double a=scan.nextDouble();
        scan.nextLine(); 
        String b=scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + b);
        System.out.println("Double: " + a);
        System.out.println("Int: " + i);
    }
}
