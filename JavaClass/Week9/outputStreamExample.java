package JavaClass.Week9;

import java.io.OutputStream;
import java.io.FileOutputStream;

class outputStreamExample
{
     public static void main(String[] args)
     {
          String str="This is a line of text inside file";

          try
          {
               OutputStream out=new FileOutputStream("D://Coding/Java/JavaC/JavaClass/Week9");
               //Notes- If this path is not working just make a file name "data2.txt" in D Drive, and give its path, it worked.

               byte databytes[]=str.getBytes(); //getBytes method will return the content of "str" to the left hand side method.
               out.write(databytes);
               out.close();

               System.out.println("Written to file");
          }

          catch (Exception e)
          {
               System.out.println(e);
          }
     }
}