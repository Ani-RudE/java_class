//package JavaClass.Week5;
public class multiCatch {
     public static void main(String args[])
     {
          try
          {
               int a=args.length;
               int b=42/a;
               int c[]={5};
               c[25]=10;
               System.out.println("b = "+b);
          }
          catch (ArithmeticException e)
          {
               System.out.println("Arithmentic Exception:"+e);
          }
          catch (ArrayIndexOutOfBoundsException e)
          {
               System.out.println("Array IOB: "+e);
          }
          finally
          {
               System.out.print("Ani");
          }
     }
}