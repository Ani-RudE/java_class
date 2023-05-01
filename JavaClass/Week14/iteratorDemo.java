//Accessing a collection using an iterator
package Week14;

import java.util.*;

class iteratorDemo
{
  public static void main(String[] args)
  {
    ArrayList<String> a1=new ArrayList<String>();
    a1.add("F");
    a1.add("B");
    a1.add("C");
    a1.add("E");

    Iterator<String> itr=a1.iterator(); //Iterator is a built in interface name, "itr" is the object name
    //"iterator()"" is a built in method, it will return the base address of the first element in the object "a1" to the LHS element "itr"

    while (itr.hasNext()) //The "hasNext()" will return TRUE till we reach the last element
    //The last element in the list is "null", in which case the "hasNext()" will return FASLE
    {
      String elem=itr.next();
      System.out.println(elem);
    }
  }
}