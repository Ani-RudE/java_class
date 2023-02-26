//Write a Java program to find the second smallest element in an array.
import java.util.*;

public class code2{
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
          System.out.println("Enter array elements: ");

          for (int i=0; i<n; i++)
          {
               arr[i]=scan.nextInt();
               if (arr[i]>max)
                    max=arr[i];
               if (arr[i]<min)
                    min=arr[i];
          }

          int SecMin=Integer.MAX_VALUE;
          int SecMax=Integer.MIN_VALUE;

          for (int i=0; i<n; i++)
          {
               if (arr[i]>SecMax && arr[i]<max)
                    SecMax=arr[i];
               if (arr[i]<SecMin && arr[i]>min)
                    SecMin=arr[i];
          }
          System.out.println("Second Smallest = "+SecMin);
          System.out.println("Second Largest = "+SecMax);

          scan.close();
     }
}