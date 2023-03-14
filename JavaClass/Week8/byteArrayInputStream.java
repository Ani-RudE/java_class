//ByteArrayInputStream
// package JavaClass.Week8;

import java.io.ByteArrayInputStream;

public class byteArrayInputStream {
     public static void main(String[] args)
     {
          String s="abc";
          byte b[]=s.getBytes();
          ByteArrayInputStream in=new ByteArrayInputStream(b);

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
          }
     }
}