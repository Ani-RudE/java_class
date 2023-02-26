//Write a Java program to get the difference between the largest and smallest values in an array of integers.
import java.util.*;
import java.lang.Math;

public class code1{
     public static void main(String[] args)
     {
          int n;
          Scanner scan=new Scanner(System.in);
          System.out.print("Size of array = ");
          n=scan.nextInt();

          int[] arr;
          arr=new int[n];
          int min=Integer.MAX_VALUE;
          int max=Integer.MIN_VALUE;
          System.out.print("Enter array elements: ");

          for (int i=0; i<n; i++)
          {
               arr[i]=scan.nextInt();
               if (arr[i]>max)
                    max=arr[i];
               if (arr[i]<min)
                    min=arr[i];
          }

          System.out.println("Smallest = "+min);
          System.out.println("Largest = "+max);
          System.out.println("Difference = "+Math.abs(max-min));

          scan.close();
     }
}