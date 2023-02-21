package p1;

public class balance {
     String name;
     double bal;
     public balance(String n, double b)
     {
          name=n;
          bal=b;
     }

     void show()
     {
          System.out.println("Name = "+name);
          System.out.println("Balance = "+bal);
     }
}