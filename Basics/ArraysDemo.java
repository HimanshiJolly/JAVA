import java.util.Arrays;
public class ArraysDemo{
    public static void main(String [] args)
    {
        //array declaration
       int[] marks= new int[4];
       marks[0]=95;
       marks[1]=90;
       marks[2]=92;
       //marks[3]=90;
       System.out.println(marks[3]);
       //boolean array
       boolean[] choice=new boolean[4];
       choice[1]=true;
       System.out.println(choice[2]);
       System.out.println(choice[1]);
       //some imp functions in java:length and sorting.
       //length
       int[] cae=new int[5];
       cae[0]=10;
       cae[1]=6;
       cae[2]=2;
       cae[3]=8;
       cae[4]=10;
       System.out.println("Length of array: "+cae.length);
       //sorting
       System.out.println("Before sorting: ");
       for(int i=0;i<=cae.length-1;i++)
       {
        System.out.print(cae[i]+" ");}
       Arrays.sort(cae);
       System.out.println();
       System.out.println("After sorting: ");
       for(int i=0;i<=cae.length-1;i++)
       {
        System.out.print(cae[i]+" ");
       }
       //different dimensions of arrays
       //1d array:
       int[] score={95,91,83};

       System.out.println(score[0]);
       //2d array
       int[][] finalscore={{95,91,83},{95,95,98}};
       System.out.println(finalscore[0][0]);
    }
}