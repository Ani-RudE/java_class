//Auto Boxing and Unboxing
// package JavaClass.Week11-(2);

class autoBox {
     public static void main(String[] args)
     {
          Integer iob=100; //auto boxing
          //Integer is a built in wrapper class name, and "iob" is a user defined object.
          //"iob" is inherited from Integer class.
          //If we assign an int constant, the object "iob" will store that value as well.
          //Here Java creates an object without the "new" keyword. This feature is known as Auto Boxing.
          
          //If we assign the value of "iob" to an int data type, then Java removes the method of that object (here "iob") and converts it into a primitive data type and assigns the value to the data type (here "int i").
          //This is known as Unboxing.
          int i=iob; //unboxing
          System.out.println(iob+" "+i);
     }
}