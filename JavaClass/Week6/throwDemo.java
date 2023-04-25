//Rrthrowing exception
public class throwDemo{
     static void throwone()
     {
          try
          {
               throw new NullPointerException("demo");
          }
          catch (NullPointerException e)
          {
               System.out.println("Inside throwone");
               throw e;
          }
     }

     public static void main(String[] args)
     {
          try{
               throwone();
          }
          catch (NullPointerException e)
          {
               System.out.println("Recaught"+e);
          }
     }
}