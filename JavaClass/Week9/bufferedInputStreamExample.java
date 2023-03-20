package JavaClass.Week9;

import java.util.*;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

class IOTest {
     String str = "This is a test";

     public void readFile()
     {
          try
          {
               FileInputStream fis=new FileInputStream("D://Coding//Java//JavaC//JavaClass//Week9//data.txt");
               BufferedInputStream bis=new BufferedInputStream(fis);
               Scanner in=new Scanner(System.in);

               int i;
               while ((i=in.read())!=-1)
               {
                    System.out.println((char)i);
               }

               in.close();
          }
          catch (Exception e)
          {
               System.out.println(e);
          }
     }    
}

class bufferedInputStreamExample
{
     public static void main(String[] args)
     {
          IOTest obj=new IOTest();
          obj.readFile();
     }
}