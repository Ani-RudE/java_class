package JavaClass.Week11;

import java.io.CharArrayWriter;
import java.io.IOException;

class charArrayWriterDemo {
     public static void main(String[] args)
     {
          CharArrayWriter F=new CharArrayWriter();
          String s="This will end up in the Array"; //s contains the data, ie, string object
          int length=s.length(); //String length which is equal to 24
          char c[]=new char[length]; 
          s.getChars(0, length, c, 0);

          try{
               F.write(c); //This will write the contents of "c" in "F"
          }
          catch (IOException e)
          {
               System.out.println(e);
          }

          //F contains object formatted data

          System.out.println("To string");
          System.out.println(F.toString()); //F contains object formatted data. So toString() method will convert it to String type
          System.out.println("to char Array");
          char buf[]=F.toCharArray(); //F contains object formatted data. So toString() method will convert it to Character array format, and the result will be copied to the character array "buf[]"
          //buf[0] means "T", buf[1] means "h", buf[2] means "i", and so on...

          for (int i=0; i<buf.length; i++)
          {
               System.out.println(buf[i]);
          }
     }
}