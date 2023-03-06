package JavaClass.Week7;

class NewThread implements Runnable
{
     Thread t;
     NewThread()
     {
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

     System.out.println("Exciting Child Thread");
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

          System.out.println("Exciting Main Thread");
     }
}