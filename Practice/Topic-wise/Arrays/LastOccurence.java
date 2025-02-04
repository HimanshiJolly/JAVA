import java.util.Scanner;
public class LastOccurence {
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter elements: ");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter your target value: ");
    int target=sc.nextInt();
    int result=-1;
    for(int i=size-1;i>=0;i--)
    {
        if(arr[i]==target)
        {
            result=i;
            break;
        }
    }
    if(result!=-1)
        {
            System.out.println("Element found at index: "+result);
        }
        else{
            System.out.println("Element not found!");
        }

  }  
}
