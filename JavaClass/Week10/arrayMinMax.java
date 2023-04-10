package JavaClass.Week10;
import java.util.*;
// import java.io.*;
// import java.lang.*;

public class arrayMinMax {
     public static void main(String args[]) throws NegativeArraySizeException
     {
          int a, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
          Scanner scan=new Scanner(System.in);
          a=scan.nextInt();
          int[] arr=new int[a];

          for (int i=0; i<a; i++)
          {
               arr[i]=scan.nextInt();
               if (arr[i]>=max)
                    max=arr[i];
          }

          for (int i=0; i<a; i++)
          {
               if (arr[i]<=min)
                    min=arr[i];
          }

          System.out.println("Largest: "+max);
          System.out.println("Smallest: "+min);

          scan.close();
     }
}