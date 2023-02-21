package Assignments;
// Develop the java code for Multilevel Hierarchy
import java.util.*;

class country{
     public void display(String country)
	{    
          System.out.println("Country: "+country);
	}
}

class state extends country{
     public void show(String state)
     {
          System.out.println("State: "+state);
     }
}

class city extends state{
     public void print(String cty)
	{
          System.out.println("City: "+cty);
	}
}

public class multilevelHiearchy{
     public static void main(String[] args)
	{
          String c, s, ct;
          Scanner scan=new Scanner(System.in);
          System.out.print("Enter Country Name: ");
          c=scan.next();
          System.out.print("Enter State Name: ");
          s=scan.next();
          System.out.print("Enter City Name: ");
          ct=scan.next();
          System.out.println();

          city obj = new city();
		obj.display(c);
		obj.show(s);
		obj.print(ct);

          scan.close();
	}
}

// https://classroom.google.com/c/NTE2MTY5MjYxNTMz/a/NTkzOTQ0NjcyMTA5/details