package JavaClass.Week12;

import java.util.*;

class arrayListDemo{
     public static void main(String[] args)
     {
          ArrayList<String> al=new ArrayList<String>();
          System.out.println("The size of 'al' initially: "+al.size());
          al.add("B");
          al.add("D");
          al.add("C");
          al.add("F");
          al.add("E");
          al.add("F");

          System.out.println();
          System.out.println("Size of 'al' ater addition: "+al.size());
          System.out.println("Elemenrs of 'al' after addition: "+al);

          al.remove("E");
          al.remove(2);

          System.out.println();
          System.out.println("Elements of 'al' after deletion: "+al);
     }
}