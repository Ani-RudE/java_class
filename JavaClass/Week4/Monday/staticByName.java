class staticDemo {
     static int a=12;
     static int b=14;
     static void callme()
     {
          System.out.println("a = "+a);
     }
}

class staticByName
{
     public static void main(String[] args)
     {
          staticDemo.callme();
          System.out.println("b = "+staticDemo.b);
     }
}