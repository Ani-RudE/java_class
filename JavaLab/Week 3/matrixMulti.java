public class matrixMulti {
     public static void main(String[] args)
     {
          int arrA[][]={{1,2},{3,4}};
          int arrB[][]={{4,3},{2,1}};

          int multiM[][]=new int[2][2];

          System.out.print(arrA.length);

          for (int i=0; i<arrA.length; i++)
          {
               for (int j=0; j<arrB.length; j++)
               {    
                    multiM[i][j]=0;
               }
          }

          for (int i=0; i<arrA.length; i++)
          {
               for (int j=0; j<arrB.length; j++)
               {   
                    for (int k=0; k<multiM.length; k++)
                    {
                         multiM[i][j]+=arrA[i][k]*arrB[k][j];
                         System.out.print(multiM[i][j]+" ");
                    }
               }

               System.out.println();
          }
     }
}