//Creating a thread

// package JavaClass.Week7;

// import java.util.*;

class NewThread implements Runnable
{
     Thread t;
     NewThread()
     {
          //Thread 
          t=new Thread (this, "demo thread");
          System.out.println("Child Thread: "+t);
     }

     static void run()
     {
          try{
               for (int i=5; i>0; i--)
               {
                    System.out.println("Child Thread "+i);
                    Thread.sleep(500);
               }
          }
          catch (InterruptedException e)
          {
               System.out.println("Child Thread interrupted");
          }
     }
     
     System.out.println("Child Thread Exception");
}

class threadDemo{
     public static void main(String[] args)
     {
          NewThread nt=new NewThread();
          nt.t.start();
          try{
               for (int i=5; i>0; i--)
               {
                    System.out.println("Main Thread "+i);
                    Thread.sleep(100);
               }
          }
          catch (InterruptedException e)
          {
               System.out.println("Main Thread interrupted");
          }

          System.out.println("Exiting Main Thread");
     }
}


// https://docs.google.com/document/d/133qz5WTsjd66ODYaFABROKH969400f44qRxmIKUQCsg/edit