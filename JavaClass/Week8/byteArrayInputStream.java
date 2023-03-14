//ByteArrayInputStream
package JavaClass.Week8;

import java.io.ByteArrayInputStream;

public class byteArrayInputStream {
     public static void main(String[] args)
     {
          String s="abc";
          byte b[]=s.getBytes();
          ByteArrayInputStream in=new ByteArrayInputStream(b);
          //ByteArrayInputStream is a predefined class, and "in" is an object.
          //String s is automatically copied to "in"

          for (int i=0; i<2; i++)
          {
               int c;
               while ((c=in.read())!=-1)
               {
                    if (i==0)
                         System.out.println((char)c);
                    else
                         System.out.println(Character.toUpperCase((char)i));
               }

               System.out.println();
               in.reset();    
               //Reset is a method of the class ByteArrayInputStream.
          }
     }
}