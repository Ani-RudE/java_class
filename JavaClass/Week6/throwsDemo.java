//Throws keyword
package JavaClass.Week6;

class throwsDemo{
     static void throwone() throws IllegalAccessException
     {
          System.out.println("Inside throwone");
          throw new IllegalAccessException("demo");
     }

     public static void main(String[] args)
     {
          try{
               throwone();
          }
          catch (IllegalAccessException e)
          {
               System.out.println("Illegal AE: "+e);
          }
     }
}