//Generics
package JavaClass.Week12;

class Gen<T> //Gen is the class name, and its data type is T
//T is a commmon data type
{
     T ob; //"ob" is template variable
     Gen (T o) //Gen is constructor here, and is a one arg constructor, "T" is data type, "o" is object
     {
          ob=o;
     }

     T getOb() //Returns template object
     {
          return ob; 
     }

     void showType()
     {
          System.out.println(ob.getClass().getName());
     }
}

class genDemo
{
     public static void main(String[] args)
     {
          Gen <Integer> iob=new Gen<Integer> (88); //"Gen<Integer>" is class name, "iob" is object name, and it will store only integer values, "new" wil allocate memory to the class Gen, "88" is integer value
          iob.showType();
          // T ob=88
          // Gen (T o)
          // {
          //      ob=o //ob gets value of 88
          // }

          int v=iob.getOb();
          System.out.println("Value 1: "+v);
          Gen <String> strob=new Gen<String>("Generics");
          strob.showType();
          String val=strob.getOb();
          System.out.println("Value 2: "+val);
     }
}

//Generic variables can store integer, char, dovnle and float data types.
//If the object is a template object, then the object can accept int, chat, double data types. It acts as a common data type.