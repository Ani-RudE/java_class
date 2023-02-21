// package JavaClass.Week4.Tuesday;
//Constructor Overloading
class Box
{
     double width;
     double height;
     double depth;

     Box (double w, double h, double d)
     {
          width=w;
          height=h;
          depth=d;
     }

     Box()
     {
          width=-1;
          height=-1;
          depth=-1;
     }

     Box (double l)
     {
          width=height=depth=l;
     }

     double volume()
     {
          return width*height*depth;
     }
}

class conOver {
     public static void main(String[] args)
     {
          Box myBox1=new Box(2.0, 3.0, 4.0);
          Box myBox2=new Box();
          Box myBox3=new Box(5.0);
          double vol;
          vol=myBox1.volume();
          System.out.println("Volume 1 = "+vol);
          System.out.println();
          vol=myBox2.volume();
          System.out.println("Volume 2 = "+vol);
          System.out.println();
          vol=myBox3.volume();
          System.out.println("Volume 3 = "+vol);
     }
}