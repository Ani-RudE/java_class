package JavaClass.Week4.Tuesday;
//Methods overriding
class override_A{
     int i, j;

     override_A(int a, int b)
     {
          i=a;
          j=b;
     }

     void show()
     {
          System.out.println("i = "+i+" and j = "+j);
          System.out.println();
     }
}

class override_B extends override_A
{
     int k;
     override_B(int a, int b, int c)
     {
          super(a,b);
          k=c;
     }

     void show()
     {
          System.out.println("k = "+k);
     }
}

class override {
     public static void main(String args[])
     {
          override_B obj=new override_B(1,2,3);
          obj.show();
     }
}

// If the base class and derived class have same methods,
// then the derived class method overides the derived class methods.