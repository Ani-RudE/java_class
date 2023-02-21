package JavaLab;
import java.util.Scanner;

public class primeNum {
   public static void main(String [] args) {
      Scanner a = new Scanner(System.in);
      int n, x=0;
      System.out.println("Num: ");
      n=a.nextInt();
      // System.out.print(b);

      for (int i=2; i<n; i++)
      {
         if (n%i==0)
         {  
            x=x+1;
            break;
         }
      }
      if (x>0)
      {
         System.out.print("Not Prime");
      }
      else
      {
         System.out.print("Prime");
      }

      a.close();
   }
}