// Find an element x in the array
import java.util.*;

public class searchElementArray {
     public static void main(String[] args)
     {
          Scanner scan=new Scanner(System.in);

          System.out.print("Input Key : ");
          int key=scan.nextInt();
          int index=-1;
          // System.out.println();

          int arr[]=new int[5];

          for (int i=0; i<arr.length; i++)
          {
               System.out.print("Input index "+i+" : ");
               arr[i]=scan.nextInt();
               if (arr[i]==key)
               {
                    index=i;
               }
          }

          if (index==-1)
          {
               System.out.println("Element "+key+" is not present.");
          }
          else
          {
               System.out.println("Element "+key+" is present at index "+index+".");
          }
          
          scan.close();
     }
}