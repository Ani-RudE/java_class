// package JavaClass.Week5;

class exceptionHandling{
     public static void main(String[] args)
     {
          int a=0, d;
          System.out.println("Ignore this"+a); // Ignore this line

          try
          {
               d=0;
               a=42/d;
               System.out.println("This line won't execute");
          }
          catch (ArithmeticException e)
          {
               System.out.println("Division by zero");
          }

          System.out.println("This is after catch block");
     }
}