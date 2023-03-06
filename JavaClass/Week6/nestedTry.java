package JavaClass.Week6;

class nestedTry
{
     public static void main(String[] args)
     {
          try{
               int a=args.length; //This is always equal to 1.
               int b=42/a; //This means that b is 42/1, i.e., 42.
               System.out.println("b = "+b);

               try
               {
                    if (a==1) //From line a=1. So this case passes
                         a=a/(a-a); //Arithmentic exception,
                         // so the control transfers to the catch block with
                         // Arithmentic exception at line 24.
                    if (a==2)
                    {
                         int c[]={2, 9};
                         c[20]=41;
                    }
               }
               catch (ArrayIndexOutOfBoundsException e)
               {
                    System.out.println("Array IOOBE: "+e);
               }
          }
          catch (ArithmeticException e) //e sotres the erroe information.
          //Here in this case, Division by zero. 
          {
               System.out.println("AE: "+e);
          }
     }
}

//OUTPUT: https://cdn.discordapp.com/attachments/1079699130777088010/1079699170199359528/image.png
//First run : javac nestedTry.java
//            java nestedTry {num}
//Second run : javac nestedTry.java
//             java nestedTry {num} {num}

//One catch block is mandatory after a try block.
//If we write multiple catch block after a try bloc, then it is called multiple catch block.
//If we wrtie one try block inside another try block, then it is called as nested catch block.