//Producer consumer model
package JavaClass.Week8;

class Buffer
{
     int a;
     boolean produced = false;

     public synchronized void produce(int x)
     {
          if (produced) {
               System.out.println("Producer is waiting");
               try {
                    wait();
               } catch (Exception e) {
                    System.out.println(e);
               }
          }

          a = x;
          System.out.println("Product " + a + " produced");
          produced = true;
          notify();
     }

     public synchronized void consume(int y)
     {
          if (!produced)
          {
               System.out.println("Consumer waiting\n");
               try
               {
                    wait();
               }
               catch (Exception e)
               {
                    System.out.println(e);
               }
          }

          System.out.println("Product " + a + " consumed");
          produced = false;
          notify();
     }
}

class Producer extends Thread 
{
     Buffer b;
     public Producer(Buffer b)
     {
          this.b = b;
     }

     public void run()
     {
          System.out.println("Producer starts producing\n");

          for (int i = 1; i <= 10; i++)
          {
               b.produce(i);
          }
     }
}

class Consumer extends Thread
{
     Buffer b;
     public Consumer(Buffer b)
     {
          this.b = b;
     }

     public void run() 
     {
          System.out.println("Consumer start consuming\n");

          for (int i = 1; i <= 10; i++) 
          {
               b.consume(i);
          }
     }
}

class producerConsumerExample
{
     public static void main(String[] args)
     {
          Buffer b = new Buffer();
          Producer p = new Producer(b);
          Consumer c = new Consumer(b);

          p.start();
          c.start();
     }
}