package JavaClass.Week9;

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

               int i;
               while ((i=bis.read())!=-1)
               {
                    System.out.print((char)i); //Char i converts ascii value of i to character
               }

               bis.close();
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