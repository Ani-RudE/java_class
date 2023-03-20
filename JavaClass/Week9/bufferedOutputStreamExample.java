package JavaClass.Week9;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

class IOTest {
     String str = "This is a test";

     public void readFile()
     {
          try
          {
               FileOutputStream fos=new FileOutputStream("D://Coding//Java//JavaC//JavaClass//Week9//data.txt");
               BufferedOutputStream bos=new BufferedOutputStream(fos);
               //fos is connected to the data.txt file
               //bos wraps fos, bos is outetr object which wraps the inner object of fos

               byte b[]=str.getBytes();
               bos.write(b); //Reference to the file, writes the content of the byte "b" to the "bos".
               bos.flush(); //Writes the data into the file
               bos.close(); //Closes the fle
               fos.close(); 

               System.out.println("Contents written successfully");
          }

          catch (Exception e)
          {
               System.out.println(e);
          }
     }
}

class bufferedOutputStreamExample
{
     public static void main(String[] args)
     {
          IOTest obj=new IOTest();
          obj.readFile();
     }
}