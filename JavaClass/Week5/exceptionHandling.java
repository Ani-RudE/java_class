// package JavaClass.Week5.Tuesday;
class exceptionHandling{
     public static void main(String[] args)
     {
          int a, d;

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