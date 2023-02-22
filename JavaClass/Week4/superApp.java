package JavaClass.Week4;

// Using the keyword "SUPER"
class superApp_A
{
     int i;
}

class superApp_B extends superApp_A
{
     int i;
     superApp_B (int a, int b)
     {
          super.i=a;
          i=b;
     }

     void show()
     {
          System.out.println("i in super class : "+super.i);
          System.out.println("i in sub class : "+i);
     }
}

class superApp
{
     public static void main(String args[])
     {
          superApp_B subob=new superApp_B(1,2);
          subob.show();
     }
}