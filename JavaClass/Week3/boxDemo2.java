package JavaClass.Week3;
class Box2{
     double w, d, h;

     Box2(double wd, double dp, double ht)
     {
          this.w=wd;
          this.d=dp;
          this.h=ht;
     }

     double volume()
     {
          return w*d*h;
     }
}

public class boxDemo2 {
     public static void main (String[] args)
     {
          Box2 b1=new Box2(1,2,3);
          Box2 b2=new Box2(2,3,4);

          double vol1=b1.volume();
          double vol2=b2.volume();

          System.out.print(vol1+"\n"+vol2);
     }
}