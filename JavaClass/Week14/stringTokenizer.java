//String Tokenizer
package Week14;

import java.util.StringTokenizer;

public class stringTokenizer {
     public static void main(String[] args)
     {
          StringTokenizer st = new StringTokenizer("This is a java program");
          System.out.println("The tokens are:");

          while (st.hasMoreTokens())
          {
               System.out.println(st.nextToken());
          }
     }
}

// Data - Raw Facts
// Information - Processed data, generated from data
// File - Collection of information
// DBMS - Collection of Files