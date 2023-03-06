package JavaClass.Week7;

class NewThread implements Runnable
{
     String name;
     Thread t;
     NewThread (String threadname)
     {
          name=threadname;
          t=new Thread(this.name);
          System.out.println("New Thread: "+t);
     }

     public void run()
     {
          try
          {
               for (int i=5; i>0; i--)
               {
                    System.out.println(name+":"+i);
                    Thread.sleep(1000);
               }
          }
          catch (InterruptedException e)
          {
               System.out.println(name+"interrupted");
          }
          System.out.println(name+"excited");
     }
}

public class multiThread{
     public static void main(String[] args)
     {
          NewThread nt1=new NewThread("one");
          NewThread nt2=new NewThread("two");
          NewThread nt3=new NewThread("three");
          nt1.t.start();
          nt2.t.start();
          nt3.t.start();

          try {
               Thread.sleep(1000);
          }
          catch (InterruptedException e)
          {
               System.out.println("Main Thread Interrrupted");
          }

          System.out.println("Exiting Main Thread");
     }
}
