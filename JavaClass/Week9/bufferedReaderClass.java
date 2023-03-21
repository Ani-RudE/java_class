package JavaClass.Week9;

import java.io.*;

public class bufferedReaderClass {
     public static void main(String[] args) throws IOException
     {
          String str;
          int i;
          int sum=0;

               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Enter integers '0' to quit");

               do
               {
                    str=br.readLine();
                    try
                    {
                         i=Integer.parseInt(str);
                         sum=sum+i;
                    }
                    catch (NumberFormatException e)
                    {
                         System.out.println("Invalid Format");
                         i=0;
                    }
               } while(i!=0);

          System.out.println("Sum = "+sum);
     }
}