package JavaClass.Week1_2;
// import java.util.*;
import java.io.*;

class BBufferReader {
     public static void main(String[] args) throws IOException
     {
          InputStreamReader IR=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(IR);
     
     
          System.out.println("Enter name: ");
          String name=br.readLine();
          System.out.println("Enter Roll");
          int roll=Integer.parseInt(br.readLine());
          System.out.println(name+" "+roll);
     }
}