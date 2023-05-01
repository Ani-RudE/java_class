//HashMap
package Week14;

import java.util.*;

class hashMapDemo {
     public static void main(String[] args) {
          HashMap<String, Double> hm = new HashMap<String, Double>();
          hm.put("Anil", 86.1);
          hm.put("Bhanu", 71.3);
          hm.put("Chandu", 55.4);
          hm.put("Pavan", 64.5);
          hm.put("Dinesh", 91.2);
          System.out.println("Hash Map: " + hm);
          System.out.println("Keys: " + hm.keySet());
          System.out.println("Values: " + hm.values());
          System.out.println("EntrySet: " + hm.entrySet());
     }
}