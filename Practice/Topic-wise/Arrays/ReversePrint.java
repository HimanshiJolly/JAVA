import java.util.Scanner;
public class ReversePrint {
    public static void main(String[] args)
    {
        int size;
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int [] arr;
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
