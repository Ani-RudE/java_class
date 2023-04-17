//Obtaining an array from ArrayList class
// package JavaClass.Week12; 

import java.util.*;

class arrayListDemo2 {
     public static void main(String[] args)
     {
          ArrayList<Integer> a1=new ArrayList<Integer>();
          a1.add(12);
          a1.add(14);
          a1.add(10);
          a1.add(23);
          a1.add(25);
          System.out.println("Contents of a1: "+a1);
          Integer[] ia=new Integer[a1.size()];
          ia=a1.toArray(ia);

          System.out.println("The contents of array: ");;
          int sum=0;

          for (int i:ia)
          {
               sum+=i;
          }
          
          System.out.println("Sum="+sum);
     }
}