package JavaClass.Week4.Tuesday;
// Methods overloading
class overloadDemo {
     void test()
     {
          System.out.println("No parameters");
          System.out.println();
     }

     void test(int a)
     {
          System.out.println("a = "+a);
          System.out.println();
     }

     void test (int a, int b)
     {
          System.out.println("a = "+a+" and b = "+b);
          System.out.println();
     }

     double test (double a)
     {
          return a*2;
     }
}

class overload
{
     public static void main(String[] args)
     {
          overloadDemo ob=new overloadDemo();
          ob.test();
          ob.test(1);
          ob.test(2,3);
          double res=ob.test(2.5);
          System.out.println("Result = "+res);
     }
}