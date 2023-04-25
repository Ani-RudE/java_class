//PriorityQueue Class
package JavaClass.Week13;

import java.util.PriorityQueue;

class priorityQueueDemo {
     public static void main(String[] args)
     {
          PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
          numbers.add(4);
          numbers.add(2);
          System.out.println("P.Q.: "+numbers);
          numbers.offer(1);
          System.out.println("P.Q.: "+numbers);
     
}