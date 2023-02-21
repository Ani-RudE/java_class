package JavaClass.Week1_2;
import java.util.*;

public class array2 {
  
    public static void main(String[] args) 
    {
        int roll[]=new int[2];
        String name[]= new String[2];
        Scanner s= new Scanner(System.in);

        for(int i=0; i<name.length; i++)
        {
            System.out.print("Enter your name ");
            name[i]= s.next();
        }
  
        for(int y:roll)
        {
            System.out.println("Enter your roll");
            roll[y]= s.nextInt();
        }

        for(int i=0; i<name.length; i++)
        {
            System.out.print("Name: ");
            System.out.print(name[i]+" ");
            System.out.println();
        }

        for(int x:roll)
        {
            System.out.print("Roll: ");
            System.out.print(roll[x]+" ");
        }

        s.close();
    }
}