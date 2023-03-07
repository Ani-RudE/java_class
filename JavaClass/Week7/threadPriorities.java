package JavaClass.Week7;

class test extends Thread
{
     public void run()
     {
          System.out.println(Thread.currentThread().getPriority()); //getPriority is a built in function
     }
}

class threadPriorities {
     public static void main(String[] args)
     {
          test thrd1=new test();
          test thrd2=new test();
          test thrd3=new test();

          thrd1.setPriority(Thread.MIN_PRIORITY); //Thread.MIN_PRIORITY -> Parameter
          //Syntax of MINIMUM PRIORITY - public static final int MIN_PRIORITY=1
          thrd2.setPriority(Thread.NORM_PRIORITY);
          //Syntax of NORMAL PRIORITY - public static final int NORM_PRIORITY=5
          thrd3.setPriority(Thread.MAX_PRIORITY);
          //Syntax of MAXIMUM PRIORITY - public static final int MAX_PRIORITY=10

          thrd1.start();
          thrd2.start();
          thrd3.start();
     }
}