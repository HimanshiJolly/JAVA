/*Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.  */
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        scan.close();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}