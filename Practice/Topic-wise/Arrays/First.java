import java.util.Scanner;
public class First {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int[] arr=new int[10];
     System.out.println("Enter elements in array: ");
     for(int i=0;i<10;i++)
     {
        arr[i]=sc.nextInt();
     }
     for(int i=arr.length-1;i>=0;i--)
     {
        System.out.print(arr[i]+" ");
     }
    }
}
