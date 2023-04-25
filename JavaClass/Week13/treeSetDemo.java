//TreeSet Class
package JavaClass.Week13;

import java.util.TreeSet;

class treeSetDemo {
     public static void main(String[] args)
     {
          TreeSet<Integer> evennumbers=new TreeSet<Integer>();
          evennumbers.add(4);
          evennumbers.add(2);
          evennumbers.add(6);
          System.out.println("Even numbers: "+evennumbers);

          TreeSet<Integer> numbers=new TreeSet<Integer>();
          numbers.add(1);
          numbers.addAll(evennumbers);
          System.out.println("Numbers: "+numbers);
     }
}


// - remove()
// - removeAll()
// - first()
// - last()
// - lower()
// - higher()
// - PollFirst()
// - PollLast()