package JavaClass.Week4;

abstract class abstractClass_A {
     abstract void callme();
     void callmetoo()
     {
          System.out.println("This is a concrete method");
     }
}

class abstractClass_B extends abstractClass_A
{
     void callme()
     {
          System.out.println("B's implementation callme");
     }
}

class abstractDemo
{
     public static void main(String args[])
     {
          abstractClass_B obj=new abstractClass_B();
          obj.callme();
          obj.callmetoo();
     }
}