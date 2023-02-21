// Find a duplicate element in array
public class duplicateEleArray {
     public static void main(String[] args)
     {
          // Scanner scan=new Scanner(System.in);

          int array[]={1,2,2,3,4,5,5};
          int key=-1;

          for (int i=0; i<array.length; i++)
          {
               if (array[i]==key)
               {
                    System.out.println("Duplicate Element is "+key);
               }
               key=array[i];
          }
     }
}