import java.util.Scanner;
class AverageElements{
    public static void main(String[] args){
        int size;
        int[] arr;
        System.out.println("Enter size of your array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter array elements:");
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Average of elements: "+Average(arr));   
    }
    public static double Average(int arr[])
    {
        double sum=0;
      for(int i=0;i<arr.length;i++)
      {
        sum=sum+arr[i];
      }
      double average=sum/arr.length;
      return average;
    }
}