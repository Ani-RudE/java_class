package JavaClass.Week3;
class Box{
     double width;
     double depth;
     double height;
     Box()
     {
          width=2;
          height=2;
          depth=2;
     }

     double volume()
     {
          return width*height*depth;
     }
}

class boxDemo{
     public static void main(String[] args)
     {
          Box b1=new Box();
          double vol=b1.volume();
          System.out.println("Volume = "+vol);
          Box b2=new Box();
          vol=b2.volume();
          System.out.println("Volume = "+vol);
     }
}