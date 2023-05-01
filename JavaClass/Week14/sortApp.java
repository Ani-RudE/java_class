//Collection Algorithm
package Week14;

import java.util.*;

class sortApp {
     public static void main(String[] args) {
          LinkedList<Integer> l1 = new LinkedList<Integer>();
          l1.add(20);
          l1.add(-20);
          l1.add(40);
          l1.add(-40);
          l1.add(10);

          Comparator<Integer> r = Collections.reverseOrder();
          Collections.sort(l1, r); // Sorts in reverse order
          System.out.println("Reverse Order");
          for (int i : l1) {
               System.out.println(i);
          }

          Collections.shuffle(l1);

          System.out.println("List Shuffle");
          for (int x : l1) {
               System.out.println(x);
          }

          System.out.println("Minimum elemenrt: " + Collections.min(l1));
          System.out.println("Maximum element: " + Collections.max(l1));
     }
}