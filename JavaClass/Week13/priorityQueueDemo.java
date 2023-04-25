//PriorityQueue Class
package JavaClass.Week13;

import java.util.PriorityQueue;
// import java.rmi.Remote;

class priorityQueueDemo {
     public static void main(String[] args)
     {
          PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
          numbers.add(4);
          numbers.add(2);
          System.out.println("P.Q.: "+numbers);
          numbers.offer(1);
          System.out.println("P.Q.: "+numbers);
          System.out.println();

          System.out.println(numbers.peek()); //Returns the head of the PQ, ie, here, 1
          System.out.println(numbers.remove(1)); //Removes the specified position element and prints true if the element is removed
          System.out.println(numbers); //Prints the present elements, ie, here, [1, 2]
          System.out.println(numbers.poll()); //Removes the head of the Queue, ie, here, 1
          System.out.println(numbers);
          System.out.println();

          boolean k=numbers.contains(4);
          System.out.println(k);
          System.out.println(numbers.size());
     }
}