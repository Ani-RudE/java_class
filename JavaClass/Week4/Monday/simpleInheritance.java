class A_simpleInheritance{
     int i, j;
     void showij()
     {
          System.out.println("i = "+i+"\nj = "+j+"\n");
     }
}

class B_simpleInheritance extends A_simpleInheritance{
     int k;
     void showk()
     {
          System.out.println("k = "+k+"\n");
     }

     void sum()
     {
          System.out.println("i + j + k = "+(i+j+k));
     }
}

public class simpleInheritance {
     public static void main (String args[])
     {
          A_simpleInheritance superob=new A_simpleInheritance();
          B_simpleInheritance subob=new B_simpleInheritance();
          superob.i=10;
          superob.j=20;
          superob.showij();
          subob.i=30;
          subob.j=40;
          subob.k=50;
          subob.showij();
          subob.showk();
          subob.sum();
     }
}