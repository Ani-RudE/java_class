//CONSOLE CLASS
package JavaClass.Week9;

import java.io.*;

class consoleExample {
     public static void main(String[] args)
     {
          Console con;
          String str;
          con=System.console();

          str=con.readLine("Enter a string");
          con.printf("Entered String is: %s", str);
     }     
}