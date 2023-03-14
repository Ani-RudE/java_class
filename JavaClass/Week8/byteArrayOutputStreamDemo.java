//ByteArrayOutputStreamDemo
package JavaClass.Week8;

import java.io.*;


public class byteArrayOutputStreamDemo {
     public static void main(String[] args)
     {
          String s="Java Programming";
          byte buf[]=s.getBytes();
          ByteArrayOutputStream F=new ByteArrayOutputStream();

          try
          {
               F.write(buf);
          }
          catch (Exception e)
          {
               System.out.println("Error writing data into buffer");
          }
          System.out.println("buffer into string");
          System.out.println(F.toString());
          System.out.println("TO ARRAY");
          byte b[]=F.toByteArray();

          for (int i=0; i<b.length; i++)
          {
               System.out.println((char)b[i]);
          }
     }
}