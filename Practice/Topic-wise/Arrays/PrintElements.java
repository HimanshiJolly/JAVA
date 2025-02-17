import java.util.Scanner;
public class PrintElements {
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
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
