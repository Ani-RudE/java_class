//For each - alternative to iterators
package Week14;

import java.util.ArrayList;

class forEachDemo {
     public static void main(String[] args) {
          ArrayList<Integer> a1 = new ArrayList<Integer>();
          a1.add(5);
          a1.add(6);
          a1.add(7);
          a1.add(12);

          for (int x : a1) {
               System.out.println(x);
          }
     }
}