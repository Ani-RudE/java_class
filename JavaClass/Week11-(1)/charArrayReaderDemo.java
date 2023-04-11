import java.io.CharArrayReader;
import java.io.IOException;

class charArrayReaderDemo {
     public static void main(String[] args)
     {
          String tmp="abcdefghijklmnopqrstuvwxyz";
          int length=tmp.length();
          char c[]=new char[length];
          tmp.getChars(0, length, c, 0); //getChars will get the characters of the String tmp, and store them in "c"
          //It will start getting characters from "0"th (first wala 0 - source begin) index of tmp till length (second wala length - source end) index of tmp, and paste them to "c" (3rd wala c - destination name) from c's 0th (4th wala 0 - destination begin) index

          int i;

          try (CharArrayReader input1=new CharArrayReader(c)) //Constructor calling representation
          {
               while ((i=input1.read())!=-1) //Reads one character at a time till end
               {
                    System.out.print((char)i+" ");
               }
          }
          catch (IOException e)
          {
               System.out.println("Error: "+e);
          }

          System.out.println();

          try (CharArrayReader input2=new CharArrayReader(c, 0, 5)) //This will read one character at a time till 4th member of the array
          {
               while ((i=input2.read())!=-1)
               {
                    System.out.print((char)i+" ");
               }
          }

          catch (IOException e)
          {
               System.out.println("error: "+e);
          }
     }     
}