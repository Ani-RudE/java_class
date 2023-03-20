import java.io.OutputStream;
import java.io.FileOutputStream;

class outputStreamExample
{
     public static void main(String[] args)
     {
          String str="This is a line of text inside file";

          try
          {
               OutputStream out=new FileOutputStream("E:\\NewFolder\\data2.txt");

               byte databytes[]=str.getBytes();
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