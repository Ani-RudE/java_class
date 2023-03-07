package JavaClass.Week7;

class test extends Thread
{
     public void run()
     {
          System.out.println(Thread.currentThread().getPriority());
     }
}

class threadPriorities {
     public static void main(String[] args)
     {
          test thrd1=new test();
          test thrd2=new test();
          test thrd3=new test();

          thrd1.setPriority(Thread.MIN_PRIORITY);
          thrd2.setPriority(Thread.NORM_PRIORITY);
          thrd3.setPriority(Thread.MAX_PRIORITY);

          thrd1.start();
          thrd2.start();
          thrd3.start();
     }
}
