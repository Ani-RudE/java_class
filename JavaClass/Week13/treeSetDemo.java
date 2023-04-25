//TreeSet Class
package JavaClass.Week13;

import java.util.TreeSet;

class treeSetDemo {
     public static void main(String[] args)
     {
          TreeSet<Integer> evennumbers=new TreeSet<Integer>(); //Creates an object named "evennumbers", the new operator allocates memory
          //The null argument makes a null arguments constructor
          evennumbers.add(4); //Adds 4 to object "evennumbers" as its first element
          evennumbers.add(2); //Adds 2 to object "evennumbers" as its next element
          evennumbers.add(6);
          System.out.println("Even numbers: "+evennumbers); //Prints characters of "evennumbers"

          TreeSet<Integer> numbers=new TreeSet<Integer>();
          numbers.add(1);
          numbers.addAll(evennumbers); //Adds the elements of "evennumbers" to the object "numbers"
          System.out.println("Numbers: "+numbers);
          System.out.println();

          boolean x=numbers.remove(2); //Removes the 2nd element from "numbers" list
          //If the element is removed then the boolean variable "x" will store the value "TRUE"
          System.out.println(x);
          System.out.println(numbers.first()); //Prints the first element
          System.out.println(numbers.last()); //Prints last element from "numbers"
          System.out.println();

          numbers.add(7);
          numbers.add(9);
          System.out.println(numbers.lower(7)); //The lower method will return the largest element which is less than "7", ie, here, 6
          System.out.println(numbers.higher(7)); //The higher method will print the highest element to 7, ie, here, 9
          System.out.println();
          System.out.println(numbers.pollFirst()); //The "pollFirst" method, first returns the first element
          //And then removes the first element from the list
          System.out.println(numbers.pollLast()); //The "pollLast" method, first returns the last element
          //And then removes the last element from the list
          System.out.println();
          System.out.println("Numbers: "+numbers);
          boolean y=numbers.removeAll(numbers);
          System.out.println(y);
     }
}


// - remove(n) - removes the n(th) term from the list
// - removeAll()
// - first()
// - last()
// - lower()
// - higher()
// - PollFirst()
// - PollLast()